package Zad2;

import java.util.ArrayList;

public class NumWorker {
    private int num =0;
    private ArrayList<Integer> Snumbers = new ArrayList<Integer>();
    public NumWorker (int num){
        this.num = num;
    }
    public void NumerousMaker(){
        int div = 2;
        Snumbers.add(1);
        System.out.print(num +" = 1");
        while (num > 1){
            while (num % div == 0){
                System.out.print(" * "+div);
                Snumbers.add(div);
                num= num/div;
            }
            div++;
        }
        System.out.println("");
    }
    public void OutNumList(){
        for (int i=0;i<Snumbers.size();i++){
            if (i != Snumbers.size()-1)
                System.out.print(Snumbers.get(i) +", ");
            else
                System.out.print(Snumbers.get(i));
        }
    }
}
