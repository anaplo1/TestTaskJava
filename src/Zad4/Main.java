package Zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int num = 14511;
        Scanner field = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = field.nextInt();
        GraphicNumber test = new GraphicNumber(num);
        test.PrintNumbers();
    }
}
