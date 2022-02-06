package Zad1;

public class StringWorker {
    private String string;
    public StringWorker(String string){
        this.string = string;
    }
    public int CountNumString(){
        int sum =0;
        int num;
        for (int i=0;i<string.length();i++){
            if (isDigit(string.charAt(i))){
                num = Integer.parseInt(String.valueOf(string.charAt(i)));
                sum += num;
            }
        }
        return sum;
    }
    private boolean isDigit(char c){
        return Character.isDigit(c);
    }
}
