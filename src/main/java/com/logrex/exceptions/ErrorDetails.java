package com.logrex.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter@Getter
public class ErrorDetails {

    private LocalDateTime timeStamp;
    private  String message;

    private  String details;

}
