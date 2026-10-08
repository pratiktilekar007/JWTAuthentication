package jwtauth.jwt.dto;

import jakarta.validation.constraints.NotBlank;

public class AuthRequest {

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    // ── Getters ───────────────────────────────────────────────────────────────

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // ── Setters ───────────────────────────────────────────────────────────────

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ── toString (optional, useful for logging) ───────────────────────────────

    @Override
    public String toString() {
        return "AuthRequest{username='" + username + "'}";  // never log password!
    }
}