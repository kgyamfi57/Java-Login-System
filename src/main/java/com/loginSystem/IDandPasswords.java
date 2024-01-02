package com.loginSystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginCred = new HashMap<String,String>();
    IDandPasswords(){
        loginCred.put("kev","lasagna");
        loginCred.put("kboy", "password");
        loginCred.put("chrome", "mac123");
    }
    protected HashMap getLoginCred(){
        return loginCred;
    }
}
