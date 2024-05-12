package com.logrex.service;

import com.logrex.dto.LoginDTO;
import com.logrex.dto.ResisterDTO;

public interface AuthService {

    public  String resister(ResisterDTO resisterDTO);
    public  String  longin(LoginDTO loginDTO);
}
