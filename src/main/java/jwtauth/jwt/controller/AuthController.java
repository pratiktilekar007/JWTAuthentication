package jwtauth.jwt.controller;

import jakarta.validation.Valid;
import jwtauth.jwt.dto.AuthRequest;
import jwtauth.jwt.dto.AuthResponse;
import jwtauth.jwt.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService ;
    
    public AuthController(AuthService authService) {
    	this.authService=authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
