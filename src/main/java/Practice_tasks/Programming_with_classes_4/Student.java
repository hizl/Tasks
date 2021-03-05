package Practice_tasks.Programming_with_classes_4;

class Student {
    private String name;
    private String initials;
    private int group;
    private int grades[];
    private int nGrades;

    public Student(String name, String initials, int group) {
        this.group = group;
        this.name = name;
        this.initials = initials;
        nGrades = 0;
        grades = new int[5];
    }

    void addGrade(int grade) {
        grades[nGrades] = grade;
        nGrades++;
    }

    boolean isGoodStudent() {
        for (int i = 0; i < nGrades; ++i) {
            if (grades[i] != 9 && grades[i] != 10) {
                return false;
            }
        }
        return true;
    }
}
