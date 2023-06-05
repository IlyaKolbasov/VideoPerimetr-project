package by.koolbasov.videoperimetrproject.controllers.auth;

import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.entity.User;
import by.koolbasov.videoperimetrproject.jwt.JwtService;
import by.koolbasov.videoperimetrproject.repository.AddressRepository;
import by.koolbasov.videoperimetrproject.repository.UserRepository;
import by.koolbasov.videoperimetrproject.table.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
        var address = Address.builder()
                .city(request.getCity())
                .street(request.getStreet())
                .houseNum(request.getHouseNum())
                .flatNnum(request.getFlatNum())
                .build();
        addressRepository.save(address);
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .address(address)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }


    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
