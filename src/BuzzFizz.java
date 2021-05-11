import java.util.Scanner;

public class BuzzFizz {
    public static void main (String [ ] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número:");
        int numero = scanner.nextInt();

        if (numero % 5 == 0 && numero % 3 == 0){
            System.out.println("BuzzFizz");
        }
        else if (numero % 5 == 0){
            System.out.println("Fizz");
        }
        else if (numero % 3 == 0){
            System.out.println("Buzz");
        }
        else System.out.println(numero);
    }
}
