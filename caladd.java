import java.util.Scanner;

public class caladd {

    public static void main(String[] args) {
        float a, b, res;
        char choice, ch;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("1. ADD TWO Numbers\n");
            System.out.print("2. Exit\n\n");
            System.out.print("Enter your choice : ");
            choice = scan.next().charAt(0);

            switch(choice){
                case '1':
                    System.out.print("Enter two numbers: ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;

                case '2':
                    System.exit(0);
                    break;

                default:
                    System.out.printf("INVALID CHOICE!!!");
                    break;
            }

            System.out.print("\n----------------------------------------\n");
        
        }while(choice != 2);
    }
}