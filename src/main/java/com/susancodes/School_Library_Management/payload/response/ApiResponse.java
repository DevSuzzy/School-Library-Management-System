package com.susancodes.School_Library_Management.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResponse<T> {
    private String status;

    private String message;

    private T  data;

    public ApiResponse(T data) {
        this.status = "00" ;
        this.message = "successful";
        this.data = data;
    }
}
