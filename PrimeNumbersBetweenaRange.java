//Java Programming
//Learning Pioneer Notes
// Java Program to Print all Prime Numbers between a Range
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int start;
        int end;
        System.out.println("Please enter the range");
        Scanner sc=new Scanner(System.in);
        start=sc.nextInt();
        end=sc.nextInt();
        System.out.println("prime numbers between "+start+" and "+end +" are");
        for(int i=start;i<=end;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}