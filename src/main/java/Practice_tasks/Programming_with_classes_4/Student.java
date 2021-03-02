package Practice_tasks.Programming_with_classes_4;

public class Student {

    private String name;
    private int numberGroup;
    private int[] academicPerformance = new int[5];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    Student[] student = new Student[10];




    public void getStudentsParam() {


    }


}
