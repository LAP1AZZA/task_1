package com.company;

import java.util.Random;
public class Sequences {
    private int difficultyLevel;
    public Sequences(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public String Array() {
        final Random random = new Random();
        int[] number = new int[difficultyLevel + 1];
        for (int i = 0; i < number.length - 1; i++) {
            number[i] = random.nextInt(9);
            for (int j = 0; j < i; j++) {
                if(number[i] == number[j]){
                    j = 0;
                    number[i] = random.nextInt(9);
                }
            }
        }
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < number.length - 1; i++)  numberBuilder.append(number[i]);
        return numberBuilder.toString();
    }
    public static Boolean comparisonOfSequences(Input input, String hiddenNumber) {
        int bulls = 0, cows = 0;
        String userVariant = input.SequenceInput();
        for (int i = 0; i < userVariant.length(); i++) {
            if(userVariant.charAt(i) == hiddenNumber.charAt(i)) bulls++;
            else{
                for (int j = 0; j < hiddenNumber.length(); j++) {
                    if(userVariant.charAt(i) == hiddenNumber.charAt(j)) cows++;
                }
            }
        }
        System.out.println("коровы: " + cows + "   " + "быки: " + bulls);
        if (bulls == input.getDifficultyLevel()) return true;
        return false;
    }
}