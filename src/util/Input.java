package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
       this.scan = new Scanner(System.in).useDelimiter("\n");
        }
    }
    public String getString(){
        return this.scan.next();
        }

    public String getString(String  prompt) {
        System.out.println(prompt);
        return this.scan.next();
    }


    public boolean yesNo() {
    String input = this.scan.next();
    if(input.equalsIgnoreCase("y" || input.equalsIgnoreCase("yes")) {
            return true;
        } else{
            return false;
        }
    }


    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.scan.next();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }

    public int getInt(int min, int max, String prompt) {
            System.out.println(prompt);

            int userInput = this.getInt();

            if(userInout > max || userInput < min) {
                return getInt(min, max);
            } else {
                return userInput;
            }
        }




}