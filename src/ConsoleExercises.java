import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("This is what you entered");
        System.out.println(a);



        System.out.println("Enter a word: ");
        String string1 = scan.nextLine();
        System.out.println("Enter another word: ");
        String string2 = scan.nextLine();
        System.out.println("Enter a last word: ");
        String string3 = scan.nextLine();
        System.out.println("Here is what you entered: ");
        System.out.println(string1 + " "+ string2 + " " + string3);


        System.out.println("Enter  a sentence: ");
        String sentence = scan.next();
        System.out.println(sentence);

//        String sentence = scan.nextLine();
//        System.out.println(sentence);


        System.out.println("Enter the width of the classroom.");
        String width = scan.nextLine();
        System.out.println("Enter the length of the classroom.");
        String length = scan.nextLine();
        System.out.println("area = " + length + " x " + width);
        System.out.println("perimeter = "+ length + " x " + width + " + "  );

    }
}
