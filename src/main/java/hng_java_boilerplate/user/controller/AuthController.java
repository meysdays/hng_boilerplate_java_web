package hng_java_boilerplate.user.controller;

import hng_java_boilerplate.user.dto.request.SignInDto;
import hng_java_boilerplate.user.dto.request.SignupDto;
import hng_java_boilerplate.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody SignupDto signupDto){
            return userService.registerUser(signupDto);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody SignInDto signInDto){
        return userService.signInUser(signInDto);
    }
}
