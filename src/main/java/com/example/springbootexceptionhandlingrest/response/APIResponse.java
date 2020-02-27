package com.example.springbootexceptionhandlingrest.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class APIResponse<T> {
    private String code;
    private String message;
    private T data;
    private APIError apiError;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public APIError getApiError() {
        return apiError;
    }

    public void setApiError(APIError apiError) {
        this.apiError = apiError;
    }
}
