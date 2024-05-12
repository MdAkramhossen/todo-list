package com.logrex.restApp;

import com.logrex.dto.LoginDTO;
import com.logrex.dto.ResisterDTO;
import com.logrex.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/resister")
    public ResponseEntity<String> resister(@RequestBody  ResisterDTO resisterDTO){

        String response=authService.resister(resisterDTO);

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public  ResponseEntity<String>login(@RequestBody  LoginDTO loginDTO){

       String response= authService.longin(loginDTO);

       return ResponseEntity.ok(response);

    }


}*/
