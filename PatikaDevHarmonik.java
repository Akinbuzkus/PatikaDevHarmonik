
import java.util.Scanner;


public class PatikaDevHarmonik {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num=scan.nextInt();
        
        double result=0;
        
        for(double i=1;i<=num;i++){
        result+=1/i;
        }
        
        System.out.println("The result is :"+result);
    }
}
