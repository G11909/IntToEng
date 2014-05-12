import java.util.Scanner;

public class IntToEng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int rest=n;
        return tlTwenty(rest);
    }
    
    static String tlTwenty(int r){
    	String a[]=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten",
    			"eleven","twelve","thirteen","fourtenn","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};	
    	return a[r];
    }
}