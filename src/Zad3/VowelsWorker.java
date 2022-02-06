package Zad3;

import java.util.Arrays;

public class VowelsWorker {

    private String pattern = "аиеёоуыэюяАИЕЁОУЫЭЮЯ";
    private String[] splittedSentence;

    public VowelsWorker(String sentence){
        splittedSentence = sentence.split(" ");
        for (int i = 0; i<splittedSentence.length;i++){
            System.out.print(splittedSentence[i]+ " ");
        }
        System.out.println("");
    }

    public int CountVowels(){
        int count =0;
        String word ="";
        for (int i=0;i<splittedSentence.length; i++){
            word = splittedSentence[i];
            for (int j=0;j<word.length();j++){
                if (pattern.indexOf(word.charAt(j)) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void SortSentenceByVowels(){
        int count =0;
        String exchange ="";
        for (int i=0;i<splittedSentence.length; i++){
            for (int j=0;j<splittedSentence.length - 1;j++){
                if (VowelsCounter(splittedSentence[j+1]) > VowelsCounter(splittedSentence[j])){
                    exchange = splittedSentence[j+1];
                    splittedSentence[j+1] = splittedSentence [j];
                    splittedSentence[j] = exchange;
                }
            }
        }
    }

    public void MakeFirstUpperCase(){
        char[] word;
        for (int i=0;i<splittedSentence.length; i++){
            word = splittedSentence[i].toCharArray();
            if (Character.isLowerCase(word[0]) && pattern.indexOf(splittedSentence[i].charAt(0)) != -1){
                word[0] = Character.toUpperCase(word[0]);
                splittedSentence[i] = new String(word);
            }
        }
    }

    public String[] getSplittedSentence(){
        return splittedSentence;
    }

    private int VowelsCounter(String word){
        int count = 0;
        for (int i=0;i<word.length();i++){
            if (pattern.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
