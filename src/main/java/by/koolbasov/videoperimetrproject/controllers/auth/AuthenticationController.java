package by.koolbasov.videoperimetrproject.controllers.auth;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userlog")
@RequiredArgsConstructor
public class AuthenticationController {
    @Autowired
    private AuthenticationService service;

    @PostMapping("/registration")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request)
    {
        try {
            return ResponseEntity.ok(service.register(request));
        }
        catch (Exception ex){
            return ResponseEntity.ok(ex.getMessage());
        }
    }
    @PostMapping("/login")
    public ResponseEntity<String> authenticate(
            @RequestBody AuthenticationRequest request, HttpServletResponse response
    ) {
        HttpHeaders headers = service.authenticate(request, response);

        // Создаем тело ответа
        String responseBody = "Пример ответа сервера с установленными куками";

        // Возвращаем ResponseEntity с заголовками, телом и статусом
        return ResponseEntity.status(HttpStatus.OK)
                .headers(headers)
                .body(responseBody);
    }


}
