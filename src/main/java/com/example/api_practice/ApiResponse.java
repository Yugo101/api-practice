package com.example.api_practice;

import java.time.LocalDateTime;
import java.util.Map;

public class ApiResponse<T> {
    private String status;
    private  T data;
    private String message;
    private Map<String, String> errors;
    private LocalDateTime timestamp;

    public ApiResponse(String status, T data, String message, Map<String, String> errors){
        this.status = status;
        this.data = data;
        this.message = message;
        this.errors = errors;
        this.timestamp = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>("success", data, null, null);
    }

    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>("error", null, message, null);
    }

    public static <T> ApiResponse<T> validationError(String message, Map<String, String> errors){
        return new ApiResponse<>("error", null, message, errors);
    }


    public String getStatus(){
        return  status;
    }

    public T getData(){
        return data;
    }

    public String getMessage(){
        return message;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
