package com.javamentor.calculator;

import java.util.Arrays;

public class Translator {
    private String number;

    public Translator(String number) {
        this.number = number;
    }

    String[] ROMAN_NUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] ARABIC_NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    boolean isRoman = false;

    public int solution() {

        if (!(Arrays.asList(ROMAN_NUMBERS).contains(number) || Arrays.asList(ARABIC_NUMBERS).contains(number))) {
            throw new IllegalArgumentException("Одно или оба из введенных чисел меньше 0 или больше 10. Оба числа (включительно) должны быть в диапазоне от 1 до 10.");
        }


        for (int i = 0; i < ROMAN_NUMBERS.length; i++)
            if (ROMAN_NUMBERS[i].equals(number)) {
                isRoman = true;
            }

        if (isRoman) {
            TranslatorRomanToArabic translatorRomanToArabic = new TranslatorRomanToArabic(number);
            return translatorRomanToArabic.solution();
        } else {
            TranslatorArabicToArabic translatorArabicToArabic = new TranslatorArabicToArabic(number);
            return translatorArabicToArabic.solution();
        }
    }


}
