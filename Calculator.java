import java.util.Scanner;

public class Calculator {
    


    public static void addition(double a, double b) {
        System.out.println(a+b);
       
    }
    public static void substraction(double a, double b) {
        System.out.println(a-b);
    }
    public static void multiplication(double a, double b) {
        System.out.println(a*b);
    }
    public static void division(double a, double b) {
        System.out.println(a/b);
    }
    public static void power(double a, double b) {
        System.out.println(Math.pow(a, b));
    }

    public static void main(String[] args) {
        
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        while(!flag){
            System.out.printf("1.Addition\n2.substraction\n3.Multiplication\n4.division\n5.Power\n6.Exit");
            int option =sc.nextInt();
            System.out.println("enter 2 numbers");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
          
      
            switch (option) {
                case 1:
                    addition(a,b);
                    break;
                case 2:
                substraction( a,  b);
                    
                    break;
                case 3:
                multiplication( a,  b);
                    break;
                case 4:
                division( a,  b);
                    break;
                case 5:
                power( a,  b);
                break;

                case 6:
                 flag=false;
                break;
            }
        }sc.close();
    }
}