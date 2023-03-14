package com.example.parcial1;

public class calculations {
    public int calcFactorial(int num) {
        if(num==0) return 1;
        return num*calcFactorial(num-1);
    }
}
