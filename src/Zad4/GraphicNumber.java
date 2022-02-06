package Zad4;

import java.util.ArrayList;
import java.util.Collections;

public class GraphicNumber {
    ArrayList<String[]> numbersGraphic = new ArrayList<String[]>();
    int number;
    public GraphicNumber(int number){
        this.number = number;
        numbersGraphic.add(new String[]    {
                "    ***    ",
                "   *   *   ",
                "  *     *  ",
                "  *     *  ",
                "  *     *  ",
                "   *   *   ",
                "    ***    "});
        numbersGraphic.add(new String[]{
                "    *    ",
                "   **    ",
                "    *    ",
                "    *    ",
                "    *    ",
                "    *    ",
                "   ***   "});
        numbersGraphic.add(new String[]    {
                "    ***    ",
                "   *   *   ",
                "   *  *    ",
                "     *     ",
                "    *      ",
                "   *       ",
                "  *****    "});
        numbersGraphic.add(new String[]    {
                "    ***    ",
                "   *   *   ",
                "      *    ",
                "     *     ",
                "      *    ",
                "   *   *   ",
                "    ***    "});
        numbersGraphic.add(new String[]    {
                "      *    ",
                "     **    ",
                "    * *    ",
                "   *  *    ",
                "  ******   ",
                "      *    ",
                "      *    "});
        numbersGraphic.add(new String[]    {
                "   *****   ",
                "   *       ",
                "   *       ",
                "   ****    ",
                "       *   ",
                "       *   ",
                "   ****    "});
        numbersGraphic.add(new String[]    {
                "     ***   ",
                "    *      ",
                "   *       ",
                "   ****    ",
                "  *    *   ",
                "  *    *   ",
                "   ****    "});
        numbersGraphic.add(new String[]    {
                "   *****   ",
                "       *   ",
                "      *    ",
                "     *     ",
                "    *      ",
                "   *       ",
                "   *       "});
        numbersGraphic.add(new String[]    {
                "   ****    ",
                "  *    *   ",
                "  *    *   ",
                "   ****    ",
                "  *    *   ",
                "  *    *   ",
                "   ****    "});
        numbersGraphic.add(new String[]    {
                "   ****    ",
                "  *    *   ",
                "  *    *   ",
                "   ****    ",
                "      *    ",
                "      *    ",
                "   ***     "});
    }
    public void PrintNumbers(){
        int max =0;
        ArrayList<Integer> numerous = new ArrayList<Integer>();
        while (number!= 0){
            numerous.add(number % 10);
            number = number /10;
        }

        for (int i =0; i<numerous.size();i++)
            if (max < numerous.get(i))
                    max = numerous.get(i);
        Collections.reverse(numerous);
        for (int i=0;i<7;i++){
            for (int j=0;j<numerous.size();j++){
                if (numerous.get(j) == max)
                    numbersGraphic.get(numerous.get(j))[i] = numbersGraphic.get(numerous.get(j))[i].replace('*', (char) (max+'0'));
                System.out.print(numbersGraphic.get(numerous.get(j))[i]);
            }
            System.out.print("\n");
        }
    }
}
