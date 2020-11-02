package com.company;

public class Main {
    private static int counter = 0;
    private static String hiddenNumber;
    public static void main(String[] args) {
        System.out.print("Введите сложность игры от 3 до 5: ");
        Input input = new Input();
        input.setDifficultyLevel(input.DifficultyLevelInput());
        Sequences sequenceArray = new Sequences(input.getDifficultyLevel());
        hiddenNumber = sequenceArray.Array();
        courseOfGame(input, hiddenNumber);
    }
    private static void courseOfGame(Input input, String hiddenNumber) {
        counter++;
        if (Sequences.comparisonOfSequences(input, hiddenNumber)) EndGame(true);
        else courseOfGame(input, hiddenNumber);

    }
    public static void EndGame(Boolean resultGame){
        if (resultGame) System.out.print("Победа \n");
        else System.out.print("Вы проиграли \n");
        System.out.println("Число попыток: " + counter + "\n" + "Загаданная последовательность: " + "\n" + hiddenNumber);
        System.exit(0);
    }
}