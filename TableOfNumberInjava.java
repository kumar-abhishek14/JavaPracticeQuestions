// Online Java Compiler
// Java Program to Print table of Any Number
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int n;
        System.out.println("Please enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}