
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAsk = scan.nextLine();
        do {
            String answer1 = "Sure";
            String answer2 = "Whoa, chill out!";
            String answer3 = "Fine. Be that way!";
            String answer4 = "Whatever";
            System.out.print(" What are you trying to say Bob?");
            String userSays = scan.nextLine();
        if (userSays.endsWith("?")){
            System.out.println(answer1);
        } else if (userSays.endsWith("!")) {
            System.out.println(answer2);
        } else if (userSays.trim().equals("")) {
            System.out.println(answer3);
        } else {
            System.out.println(answer4);
        }
            System.out.println("Is there anything else you want to ask Bob?");

        } while (userAsk.equals("y"));




    }
}
