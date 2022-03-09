package sample;

public class StudentRecord {

    //Constructor variables
    private String studentID;
    private float midterm;
    private float assignments;
    private float finalExam;

    //Non-constructor variables
    private float finalMark;
    private char letterGrade;

    public StudentRecord(String studentID, float midterm, float assignments, float finalExam) {
        this.studentID = studentID;
        this.midterm = midterm;
        this.assignments = assignments;
        this.finalExam = finalExam;

        setFinalMark();
        setLetterGrade();
    }

    private void setFinalMark() {
        this.finalMark = (float) (((0.2*this.assignments) + (0.3*this.midterm) + (0.5*finalExam)));
    }

    private void setLetterGrade() {
        if(this.finalMark >= 80 && this.finalMark <= 100){
            this.letterGrade = 'A';
        }
        if(this.finalMark >= 70 && this.finalMark < 80){
            this.letterGrade = 'B';
        }
        if(this.finalMark >= 60 && this.finalMark < 70){
            this.letterGrade = 'C';
        }
        if(this.finalMark >= 50 && this.finalMark < 60){
            this.letterGrade = 'D';
        }
        if(this.finalMark < 50){
            this.letterGrade = 'F';
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public float getMidterm() {
        return midterm;
    }

    public float getAssignments() {
        return assignments;
    }

    public float getFinalExam() {
        return finalExam;
    }

    public float getFinalMark() {
        return finalMark;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
}
