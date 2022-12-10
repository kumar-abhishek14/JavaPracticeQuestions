package com.my.test;

public class Myclass{
	public static void main(String[] args) {
		PrintFactor printfactor;
		int x=6;
		printfactor=(n)->{
			int result=1;
			for(int i=1;i<n;i++) {
				result=result*i;
			}
			return result;
		};
		System.out.println("The factorial of "+x+"is"+printfactor.factorial(6));

		ReverseNumber reverse=(p)->{
			int rem=0;
			int rev=0;
			while(p!=0) {
				rem=p%10;
				rev=rev*10+rem;
				p=p/10;
			}
			return rev;	
		};
		System.out.println("reverse of number 567890 is "+reverse.reverse(578905));
	
	GenericFunctionalInteface<String> generics=(s)->s;
	GenericFunctionalInteface<Integer> integer=(y)->y;
	System.out.println(generics.function("Ramesh"));
	System.out.println(integer.function(5));
	}
	
}
