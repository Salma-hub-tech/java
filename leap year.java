import java.util.Scanner;

//Salma Abdelaziz
class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.print("leap year");
        }
        else{
            System.out.print("not leap year");
        }



    }


}
