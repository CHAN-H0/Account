package com.example.account.exception;

import com.example.account.type.ErrorCord;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AccountException extends RuntimeException{
    private ErrorCord errorCord;
    private String errorMessage;

    public AccountException(ErrorCord errorCord){
        this.errorCord = errorCord;
        this.errorMessage = errorCord.getDescription();
    }
}
