import java.util.Scanner;

//Salma Abdelaziz
class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if(operator=='+'){
           System.out.println(num1+num2);
        }if(operator=='-'){
            System.out.println(num1-num2);
        }if(operator=='*'){
            System.out.println(num1*num2);
        }if(operator=='/'){
            System.out.println(num1/num2);
        }





    }


}
