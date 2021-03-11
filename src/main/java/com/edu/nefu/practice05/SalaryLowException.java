package com.edu.nefu.practice05;

public class SalaryLowException extends Exception{
    public SalaryLowException(){
        super();
    }

    public SalaryLowException(String message) {
        super(message);
    }
}
