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
    	System.out.println("1000000未満の数を入力して下さい");
    	break;
    	}
    	if(n==0)return "zero";
    	else{
    		String ans="";
    		int quot=0;
    		int rest=n;
    		
    		int count=keta/3;
    		int tmp=n;
    		
    		for(int i=count; i==0; count--){
    			int t=1000^count;
    			quot=tmp/t;
    			rest=tmp%t;
    			//ans+=//100までの数を出すメソッド
    			ans+=unit(count);
    			rest=tmp;
    		}
    		//ansに100までの数を出すメソッド
    	
    		/*
    		
    		do{
    		quot=rest/1000;
    		rest=rest%1000;
    		count++;
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
    	}*/
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
    	String ans="";
    	return ans;
    }
    }
    
}