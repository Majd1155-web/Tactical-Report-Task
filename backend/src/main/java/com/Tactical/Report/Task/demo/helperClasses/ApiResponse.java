package com.Tactical.Report.Task.demo.helperClasses;

import lombok.Data;

@Data
public class ApiResponse {
    private Boolean success;
    private String message;
    private Object returnField;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ApiResponse(Boolean success, String message, Object returnField) {
        this.success = success;
        this.message = message;
        this.returnField = returnField;
    }
}
