import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put the value you want exchange: ");
        float valueReais = scanner.nextFloat();
        System.out.println("Chose the type you want to convert the value\n [1] Dollar , [2] CAD Dollar, [3] BOB");
        int choose = scanner.nextInt();
        float valueConvert = 0f;

        switch (choose){
            case 1:
                valueConvert = valueReais * 5.05f ;
                System.out.println("Your new amount is " + valueConvert + " Dollar");
                break;

            case 2:
                valueConvert = valueReais * 3.80f ;
                System.out.println("Your new amount is " + valueConvert + " CAD Dollar");
                break;

            case 3:
                valueConvert = (valueReais / 10) * 73 ;
                System.out.println("Your new amount is " + valueConvert + " BOB");
                break;

            default:
                System.out.println("You put a Incorrect coin.");
                break;

        }
    }
}