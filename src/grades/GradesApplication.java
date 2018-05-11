package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        String decision;
        Boolean yn = true;


        HashMap<String, Student> students = new HashMap<>();


        Student studentheather = new Student("Heather");
        studentheather.addGrade(98);
        studentheather.addGrade(91);
        studentheather.addGrade(95);


        Student studentyaya = new Student("Yamaly");
        studentyaya.addGrade(97);
        studentyaya.addGrade(91);
        studentyaya.addGrade(95);

        Student studentmonica = new Student("Monica");
        studentmonica.addGrade(90);
        studentmonica.addGrade(91);
        studentmonica.addGrade(94);

        Student studentjenn = new Student("Jennifer");
        studentjenn.addGrade(100);
        studentjenn.addGrade(91);
        studentjenn.addGrade(95);


        students.put("Userheather", studentheather);
        students.put("Useryaya", studentyaya);
        students.put("Usermonica", studentmonica);
        students.put("Userjenn", studentjenn);



//        Print the list of github users
        System.out.println("Check out our students:");
        for (String listStudent : students.keySet()) {
            System.out.printf(" %s", listStudent);
        }

        System.out.println();
        System.out.println("-------");

//        Ask user which student
        do {
            System.out.println("Which student do you want grades for?");
            Scanner input = new Scanner(System.in).useDelimiter("\n");
            String userInput = input.next();
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println(student.getName() + " has a grade average of " + student.getGradeAverage());
                System.out.println("Would you like to see another student?");
                yn = yesNo();
            } else {
                System.out.println("No record for that exists...");
                System.out.println("Would you like to see another student?");
                yn = yesNo();
            }

        } while (yn);

    }


    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        String yn = scanner.next();
        if (yn.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }


    }
}