package com.javamentor.calculator;

public class TranslatorRomanToArabic {
    private String number;

    public TranslatorRomanToArabic(String number) {
        this.number = number;
    }

    String[] ROMAN_NUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    int result;

    public int solution() {

        switch (number) {
            case "I":
                result = 1;
                return result;

            case "II":
                result = 2;
                return result;

            case "III":
                result = 3;
                return result;

            case "IV":
                ;
                result = 4;
                return result;

            case "V":
                ;
                result = 5;
                return result;

            case "VI":
                ;
                result = 6;
                return result;

            case "VII":
                ;
                result = 7;
                return result;

            case "VIII":
                ;
                result = 8;
                return result;

            case "IX":
                ;
                result = 9;
                return result;

            case "X":
                ;
                result = 10;
                return result;

            default:
                return 0;
        }
    }
}
