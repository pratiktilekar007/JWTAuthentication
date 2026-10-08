package jwtauth.jwt.dto;

import java.time.LocalDateTime;

public class ErrorResponse {

    private int           status;
    private String        error;
    private String        message;
    private LocalDateTime timestamp;
    private String        path;

    // ── No-Args Constructor ───────────────────────────────────────────────────
    public ErrorResponse() {}

    // ── All-Args Constructor ──────────────────────────────────────────────────
    public ErrorResponse(int status, String error, String message,
                         LocalDateTime timestamp, String path) {
        this.status    = status;
        this.timestamp = timestamp;
        this.error     = error;
        this.message   = message;
        this.path      = path;
    }

    // ── Getters ───────────────────────────────────────────────────────────────
    public int           getStatus()    { return status;    }
    public String        getError()     { return error;     }
    public String        getMessage()   { return message;   }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String        getPath()      { return path;      }

    // ── Setters ───────────────────────────────────────────────────────────────
    public void setStatus(int status)              { this.status    = status;    }
    public void setError(String error)             { this.error     = error;     }
    public void setMessage(String message)         { this.message   = message;   }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public void setPath(String path)               { this.path      = path;      }

    // ── toString ──────────────────────────────────────────────────────────────
    @Override
    public String toString() {
        return "ErrorResponse{" +
                "status="      + status       +
                ", error='"    + error        + '\'' +
                ", message='"  + message      + '\'' +
                ", timestamp=" + timestamp    +
                ", path='"     + path         + '\'' +
                '}';
    }
}