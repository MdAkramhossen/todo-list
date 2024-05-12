package com.logrex.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TodoApiException extends RuntimeException{

    private HttpStatus httpStatus;

    private String message;
    public TodoApiException(HttpStatus httpStatus, String message){

        this.httpStatus=httpStatus;
        this.message=message;
    }


}
