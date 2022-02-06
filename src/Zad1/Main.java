package Zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
	    String string = "";
        Scanner field = new Scanner(System.in);
        string = field.nextLine();
        StringWorker A = new StringWorker(string);
        System.out.print("Сумма цифр в строке: " + A.CountNumString());
    }
}
