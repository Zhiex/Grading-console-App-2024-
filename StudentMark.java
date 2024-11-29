//private fields
public class StudentMark {
    private String student;
    private float gradeMath;
    private float gradePhysics;

 // Constructor to initialize the studentmark Name and grades
    public StudentMark(String name, float math, float physics) {
        this.student = name;
        this.gradeMath = math;
        this.gradePhysics = physics;
    }
      // Public method to get the student name
    public String getStudent() {
        return this.student;
    }
      // Public method to get the Math grade
    public float getGradeMath() {
        return this.gradeMath;
    }
     // Public method to get the Physics grade
    public float getGradePhysics() {
        return this.gradePhysics;
    }
}




