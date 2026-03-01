package com.example.api_practice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TaskRequest {
    @NotBlank(message = "タイトルは必須です")
    @Size(max = 100, message = "タイトルは100文字以内です")
    private String title;
    private boolean completed;

    public String getTitle() {
        return title;
    }

    public boolean isCompleted(){
        return completed;
    }
}
