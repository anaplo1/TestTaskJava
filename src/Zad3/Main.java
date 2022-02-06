package Zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String string = "аБ овгдЕ ёжизИ";
        System.out.print("Введите строку: ");
        Scanner field = new Scanner(System.in);
        String[] splittedSentence;

        string = field.nextLine();
        VowelsWorker test = new VowelsWorker(string);

        System.out.print("Количество глассных в предложении: ");
        System.out.println(test.CountVowels());
        test.MakeFirstUpperCase();

        splittedSentence = test.getSplittedSentence();
        System.out.print("Строка с переведенными глассными в верхний регистр: ");
        for (int i=0;i< splittedSentence.length;i++){
            System.out.print(splittedSentence[i] + " ");
        }
        System.out.println("");

        test.SortSentenceByVowels();
        splittedSentence = test.getSplittedSentence();
        System.out.print("Строка отсортированная по количеству глассных: ");
        for (int i=0;i< splittedSentence.length;i++){
            System.out.print(splittedSentence[i] + " ");
        }
    }
}
