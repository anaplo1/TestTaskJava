package Zad5;

import java.util.ArrayList;

public class SafeFiller {

    private ArrayList<Item> usefulItems = null;
    private int maxWeight;
    private int bestPrice;

    public SafeFiller(int maxWeight){
        this.maxWeight = maxWeight;
    }

    private int sumWeight(ArrayList<Item> items){
        int sum =0;
        for (Item i : items){
            sum += i.getWeight();
        }
        return sum;
    }

    private int sumPrice(ArrayList<Item> items){
        int sum =0;
        for (Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    private void checkSolution(ArrayList<Item> items){
        if (usefulItems == null){
            if (sumWeight(items) <= maxWeight){
                usefulItems = items;
                bestPrice = sumPrice(items);
            }
        }
        else {
            if (sumWeight(items) <= maxWeight && sumPrice(items) > bestPrice){
                usefulItems = items;
                bestPrice = sumPrice(items);
            }
        }
    }

    public void ProducerOfSolutions(ArrayList<Item> items){
        if (items.size() > 0)
            checkSolution(items);
        for (int i=0;i<items.size();i++){
            ArrayList<Item> newSolution = new ArrayList<>(items); //мб ошибка
            newSolution.remove(i);
            ProducerOfSolutions(newSolution);
        }
    }

    public ArrayList<Item> getUsefulItems(){
        return usefulItems;
    }
}