import java.util.Scanner;
class Quadratic{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
	double a=sc.nextDouble();
	System.out.println("Enter the value of b");
	double b=sc.nextDouble();
	System.out.println("Enter the value of c");
	double c=sc.nextDouble();
	System.out.println(a+"x^2+"+b+"x+"+c);
	
	double result=b*b-4*a*c;
	double root1=0.0;
	double root2=0.0;
	if(result>0){
	root1=(-b+Math.pow(result,0.5))/2*a;
	root2=(-b-Math.pow(result,0.5))/2*a;
	System.out.println("root 1 = "+root1);
	System.out.println("root 2 = "+root2");
	}
	else if(result==0){
		root1=-b/2*a;
		root2=root1;
		System.out.println("root 1 = "+root1);
	    System.out.println("root 2 = "+root2);
		
	}
	else{
		System.out.println("no real root possible");
	}
	
	
	
  }
}