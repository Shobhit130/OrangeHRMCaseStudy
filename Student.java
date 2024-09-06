public class Student {
    private String name;
    private int marks;
    private char grade;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        calculateGrade(); // Calculate grade whenever marks are set
    }

    public char getGrade() {
        return grade;
    }

    private void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setMarks(85);

        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.getGrade());
    }
}
