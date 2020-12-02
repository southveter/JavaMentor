package com.javamentor.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String[] ROMAN_NUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] ARABIC_NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] OPERATION = {"+", "-", "*", "/"};

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String operator = scanner.next();
        String b = scanner.next();

        if ((Arrays.asList(ROMAN_NUMBERS).contains(a) && Arrays.asList(ARABIC_NUMBERS).contains(b)) || (Arrays.asList(ROMAN_NUMBERS).contains(b) && Arrays.asList(ARABIC_NUMBERS).contains(a))) {
            throw new IllegalArgumentException("Введены два разных формата цифр. Обе цифры должны быть или арабскими, или римскими.");
        }

        if (!(Arrays.asList(OPERATION).contains(operator))) {
            throw new IllegalArgumentException("Получена операция не сложения, вычитания, умножения или деления. Обрабатывается только сложение, вычитание, умножение или деление.");
        }

        Translator translatorA = new Translator(a);
        int firstNumber = translatorA.solution();

        Translator translatorB = new Translator(b);
        int secondNumber = translatorB.solution();

        Action action = new Action(firstNumber, secondNumber, operator);
        int result = action.solution();


        boolean isRoman = false;


        for (int i = 0; i < ROMAN_NUMBERS.length; i++)
            if (ROMAN_NUMBERS[i].equals(a)) {
                isRoman = true;
            }


        if (isRoman) {
            System.out.println(TranslatorArabicToRoman.solution(result));
        } else {
            System.out.println(result);
        }

    }

}
