package grades;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;

    private ArrayList<Integer> grades;

//    private String grade;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

//    public String toString() {
//        return name;
//    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) System.out.println("That is invalid!");
      else this.name =name;

}

    public void addGrade(int grade){
        grades.add(grade);

    }
//    // returns the average of the students grades
    public double getGradeAverage(){
       double average = 0;
       int total= 0;

//        add the sum of the grades

                for (int i= 0; i < grades.size(); ++i ) {
           total += grades.get(i);

                 average =   total/grades.size();



                }
//        take the sum and divide by the length of the ArrayList
//          return average
        return average;

    }


    public static void main(String[] args) {

        Student s1= new Student("Monica");


        s1.addGrade(98);
        s1.addGrade(99);
        System.out.println(s1.grades);
        System.out.println(s1.getGradeAverage());
    }


    }