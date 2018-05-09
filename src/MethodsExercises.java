import java.util.Scanner;

//Basic Arithmetic
public class MethodsExercises {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    public static void divide(int a, int b) {
        System.out.println(a / b);

    }
    public static int modulo(int a, int b) {
        return a % b;
    }

    //validation
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

    public static long calculateFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
            System.out.println("Please enter an integer from 1 to 10");
            int userInt = getInteger(1, 10);
            System.out.println(calculateFactorial(userInt));
            do {
                System.out.println("Do you wish to continue? [y/n]: ");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

            willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }


    public static void main(String[] args) {

        add(7, 8);
        subtract(7, 8);
        multiply(7, 8);
        divide(7, 8);
        modulo(7, 8);

        Scanner sc = new Scanner(System.in);
        userInteractionFactorial(sc);


    }
}



