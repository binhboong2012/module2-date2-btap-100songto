package com.codegym;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        return;
        if(number < 2) {
            return ;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if(isPrime(number)) {
                System.out.printf("-%d",number);
            }
            number ++;
        }
    }
}
