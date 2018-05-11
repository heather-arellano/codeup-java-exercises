


public class gonzoTest {


    public static void main(String[] args) {

//        gonzoExample gonzo = new gonzoExample("Heather","Monica","Gonzo");

        gonzoExample gonzo = new gonzoExample();

        gonzo.setTeachers("Monica");
        gonzo.setDirectors("Gonzo");
        gonzo.setStudents("Heather");
        gonzo.setGuards("Jose");

        System.out.printf("The student is: %s, the teacher is: %s, the director is: %s, and the guard is %s", gonzo.getStudents(), gonzo.getTeachers(),gonzo.getDirectors(), gonzo.getGuards());


    }

}
