package com.company;

public class NoBrand extends Exception {
    @Override
    public String getMessage(){
        return "Brand can not be empty!";
    }
}
