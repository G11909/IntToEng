import java.util.Scanner;

public class IntToEng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int keta=Integer.toString(n).length();
    	if(keta>6){
    	return "1,000,000未満の数を入力して下さい";
    	}
    	else if(n==0)return "zero";
    	else{
    		String ans="";
    		int quot=0;
    		int rest=0;
    		
    		
    		int tmp=n;
    		int count=keta/3;
    		if(keta>3){
    		for(int i=count; i>0; i--){
    			int t=(int) Math.pow(1000, i);
    			quot=tmp/t;
    			rest=tmp%t;
    			ans+=hundred(quot);
    			ans+=unit(count);
    			tmp=rest;
    		}
    		}
    		ans+=hundred(tmp);
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
    static String unit(int n){
    	String a[]=new String[]{"hundred ","thousand ","million ","billion ","trillion "};
    	return a[n];		
    	}
    static String hundred(int x){
    	int quot1=x/100;
    	int rest1=x%100;
    	String ans="";
    	if(quot1>0)ans+=tlTwenty(quot1)+unit(0);
    	if(rest1!=0){
    		if(rest1<20)ans+=tlTwenty(rest1);
    		else{
    			quot1=rest1/10;
    			rest1=rest1%10;
    			ans+=twoDigits(quot1);
    			ans+=tlTwenty(rest1);
    		}    	
    }
       	return ans;
    }
    
}