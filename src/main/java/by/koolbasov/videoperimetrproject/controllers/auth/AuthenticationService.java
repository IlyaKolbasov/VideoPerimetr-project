package by.koolbasov.videoperimetrproject.controllers.auth;

import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.entity.User;
import by.koolbasov.videoperimetrproject.jwt.JwtService;
import by.koolbasov.videoperimetrproject.mapper.AddressMapper;
import by.koolbasov.videoperimetrproject.repository.AddressRepository;
import by.koolbasov.videoperimetrproject.repository.UserRepository;
import by.koolbasov.videoperimetrproject.table.Role;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final AddressRepository addressRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) throws Exception {

        if (repository.findUserByEmail(request.getEmail())!=null &&
                repository.findUserByEmail(request.getEmail()).getEmail().equals(request.getEmail())) {
            throw new Exception("Пользователь с таким email уже существоет");
        }
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }


    public HttpHeaders authenticate(AuthenticationRequest request, HttpServletResponse response) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        //var jwtToken = jwtService.generateToken(user);
        Cookie cookie = new Cookie("jwt", jwtService.generateToken(user));
        cookie.setMaxAge(3600);
        cookie.setPath("/");
        cookie.setDomain("videiperimetr.vercel.app");
        cookie.setSecure(true);
        response.addCookie(cookie);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.SET_COOKIE, cookie.toString());
        /*return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();*/
        return headers;
    }
}
