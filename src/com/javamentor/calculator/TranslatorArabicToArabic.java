package com.javamentor.calculator;

public class TranslatorArabicToArabic {
    private String number;

    public TranslatorArabicToArabic(String number) {
        this.number = number;
    }

    int result;

    public int solution() {

        switch (number) {
            case "1":
                result = 1;
                return result;

            case "2":
                result = 2;
                return result;

            case "3":
                result = 3;
                return result;

            case "4":
                ;
                result = 4;
                return result;

            case "5":
                ;
                result = 5;
                return result;

            case "6":
                ;
                result = 6;
                return result;

            case "7":
                ;
                result = 7;
                return result;

            case "8":
                ;
                result = 8;
                return result;

            case "9":
                ;
                result = 9;
                return result;

            case "10":
                ;
                result = 10;
                return result;

            default:
                return 0;
        }
    }
}
