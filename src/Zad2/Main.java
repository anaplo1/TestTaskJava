package Zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
        int num =0;
        Scanner field = new Scanner(System.in);
        System.out.print("Введите число для его разложения: ");
            num = field.nextInt();
            NumWorker B = new NumWorker(num);
            System.out.print("Разложения числа " + num + " в простые множители: ");
            B.NumerousMaker();
        }
        catch (InputMismatchException e){ //Такая проверка для особо умников кто будет пытаться писать и через точку и через запятую
            System.out.print("Ошибка! Введенное число должно быть целым!");
        }
    }
}
