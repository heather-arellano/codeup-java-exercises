package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return this.scan.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scan.next();
    }


    public boolean yesNo() {
        String input = this.scan.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.scan.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);

        int userInput = this.getInt();

        if (userInput > max || userInput < min) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);

        int userInput = this.getInt();

        if (userInput > max || userInput < min) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }


    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.scan.nextInt();

    }

    public double getDouble(double min, double max) {
        System.out.println("Please input an decimal number between " + min + " and " + max);

        double userInput = this.getDouble();

        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);

        double userInput = this.getDouble();

        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }


    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.scan.nextDouble();
    }

    public int getInt() {
        String userInput = getString();

        try{
            return Integer.valueOf(userInput);

        } catch (NumberFormatException e) {
            System.out.println("Must input an integer");
            return getInt();
        }

    }

    public double getDouble() {
        String userInput = getString();

        try{
            return Double.valueOf(userInput);

        } catch (NumberFormatException e) {
            System.out.println("Must input an integer");
            return getDouble();
        }

    }

}