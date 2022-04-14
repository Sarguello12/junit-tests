import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (int grade : this.getGrades()){
            total += grade;
        }
        return total / this.getGrades().size();
    }
}
