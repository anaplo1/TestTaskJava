package Zad5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<Item> items = new ArrayList<Item>();
        Scanner field = new Scanner(System.in);
        int num =0;

        System.out.print("Введите количество предметов: ");
        num = Integer.parseInt(field.nextLine());

        for (int i=0;i<num;i++){
            System.out.print("Введите размер, цену и название предмета(строго в таком же порядке и по очереди): \n");
            items.add( new Item(Integer.parseInt(field.nextLine()), Integer.parseInt(field.nextLine()), field.nextLine()));
        }

        System.out.print("Введите свободный объем внутри сейфа: ");
        SafeFiller test = new SafeFiller(Integer.parseInt(field.nextLine()));

        test.ProducerOfSolutions(items);

        System.out.print("Список заполненного сейфа: \n");

        for (Item i : test.getUsefulItems()){
            System.out.println(i.getName() +" "+i.getWeight()+" "+i.getPrice());
        }
    }
}
