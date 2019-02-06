package com.ad.example.simplejsp.service;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("ad")
                && password.equalsIgnoreCase("pwd");
    }

}