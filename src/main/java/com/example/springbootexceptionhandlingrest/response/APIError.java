package com.example.springbootexceptionhandlingrest.response;

import org.springframework.http.HttpStatus;

public class APIError {
    private HttpStatus httpStatus;
    private String message;
    private String dateTime;

    public APIError(HttpStatus httpStatus, String message, String dateTime) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.dateTime = dateTime;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
