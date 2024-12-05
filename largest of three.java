import java.util.Scanner;
//Salma Abdelaziz
class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter third number: ");
        int z = scanner.nextInt();
        if(x>y && x>z){
            System.out.println("x is the largest");
        }else if(y>x && y>z){
            System.out.println("y is the largest");
        }else{
            System.out.println("z is the largest");
        }




    }


}
