package jwtauth.jwt.dto;

public class AuthResponse {

    private String token;
    private String tokenType;
    private long expiresIn;
    private String username;

    // ── No-Args Constructor ───────────────────────────────────────────────────
    public AuthResponse() {}

    // ── All-Args Constructor ──────────────────────────────────────────────────
    public AuthResponse(String token, String tokenType, long expiresIn, String username) {
        this.token     = token;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.username  = username;
    }

    // ── Getters ───────────────────────────────────────────────────────────────
    public String getToken()     { return token;     }
    public String getTokenType() { return tokenType; }
    public long   getExpiresIn() { return expiresIn; }
    public String getUsername()  { return username;  }

    // ── Setters ───────────────────────────────────────────────────────────────
    public void setToken(String token)         { this.token     = token;     }
    public void setTokenType(String tokenType) { this.tokenType = tokenType; }
    public void setExpiresIn(long expiresIn)   { this.expiresIn = expiresIn; }
    public void setUsername(String username)   { this.username  = username;  }

    // ── toString ──────────────────────────────────────────────────────────────
    @Override
    public String toString() {
        return "AuthResponse{" +
                "token='"     + token     + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                ", username='" + username  + '\'' +
                '}';
    }
}