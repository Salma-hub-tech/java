import java.util.Scanner;
//Salma Abdelaziz
class Main {
    public static void main(String[] args){

        Scanner Input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Input.nextInt();
        if (number <= 1){
            System.out.println(number + " is not a prime number"); // Numbers less than or equal to 1 are not prime
        }
            int i = 2;
        boolean prime=true;
           while(i <= number / 2){
               if (number % i == 0){
                   prime=false;
                   break;
               }
               i++;
           }
            if (prime){
                System.out.println(number + " is a prime number");
            }else {
                System.out.println(number + " is not a prime number");
            }
        }


    }
    
