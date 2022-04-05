package calculate;

import java.util.Scanner;

public class Main extends Calculator{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Main m = new Main();
        char ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = scan.nextInt();
            System.out.println("Enter second number");
            int b = scan.nextInt();
            System.out.println("enter the one of the symbol + ,-,*,/");
            char c=scan.next().charAt(0);
            cal.calculatorResult(a,b,c);
            Scanner input =new Scanner(System.in);
            System.out.println("if you want to add more calculation please enter\"y\" or \"N\" :" );
            String x = input.nextLine();
            ch = x.charAt(0);


        } while (ch == 'y' || ch == 'Y');
        }
    }



