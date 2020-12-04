package spring_angular_demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_angular_demo.dto.RegisterRequest;
import spring_angular_demo.service.AuthService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);

        return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
    }

    @GetMapping("/mama")
    public String mama() {
        return "maika ti";
    }
}
