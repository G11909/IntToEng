import java.util.Scanner;

public class IntToEng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n==0)return "zero";
    	if(n<20)return tlTwenty(n);
    	else{
    	String restResult="";
    	String quotResult="";
    	int quot=n/10;
    	int rest=n%10;
        quotResult=tlHundred(quot);
    	restResult=tlTwenty(rest);
        return quotResult+restResult;
    	}
    }
    
    static String tlTwenty(int r){
    	String a[]=new String[]{"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ",
    			"eleven ","twelve ","thirteen ","fourtenn ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};	
    	return a[r];
    }
    static String tlHundred(int q){
    	String a[]=new String[]{"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety ","one hundred "};
    	return a[q];    	
    }
}