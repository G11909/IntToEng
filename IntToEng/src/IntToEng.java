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
    	//if(n<20)return tlTwenty(n);
    	else{
    		int quot=0;
    		int rest=n;
    		do{
    		quot=rest/100;
    		rest=rest%100;
    		}
    		while(quot>100);
    		String ans="";
    	if(quot>0)ans+=tlTwenty(quot)+"hundred ";
    	if(rest!=0){
    		if(rest<20)ans+=tlTwenty(rest);
    		else{
    			quot=rest/10;
    			rest=rest%10;
    			ans+=twoDigits(quot);
    			ans+=tlTwenty(rest);
    		}
    	}
    	return ans;
    	}
    }
    
    static String tlTwenty(int r){
    	String a[]=new String[]{"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ",
    			"eleven ","twelve ","thirteen ","fourtenn ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};	
    	return a[r];
    }
    static String twoDigits(int q){
    	String a[]=new String[]{"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    	return a[q];    	
    }
    
}