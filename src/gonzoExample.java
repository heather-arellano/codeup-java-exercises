public class gonzoExample {

    private String students;
    private String teachers;
    private String directors;
    private String guards;


    public gonzoExample(String students, String teachers, String directors, String guards) {
        this.students = students;
        this.teachers = teachers;
        this.directors = directors;
        this.guards = guards;
    }

    public gonzoExample(){}

    public String getGuards() {
        return guards;
    }

    public void setGuards(String guards) {
        this.guards = guards;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }
}
