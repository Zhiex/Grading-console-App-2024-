public class StudentGradingApp{
    public static void main(String[] args) {

       //Declare an array StudentMark
       //store objects of type st
       //Creates an array of size 4 that can hold up to four objects of type StudentMark

        StudentMark[] st = new StudentMark[4];
        st[0] = new StudentMark("Jane", 40, 20); // Assign an instance of StudentMark 
        st[1] = new StudentMark("Jon", 70, 60);
        st[2] = new StudentMark("Stewart", 80, 75);

        System.out.format("%-20s %8s %8s%n", "STUDENT", "MATH", "PHYSICS");
        for (int i = 0; i < st.length; i++) {
            System.out.format("%-20s %8.2f %8.2f%n", st[i].getStudent(), st[i].getGradeMath(), st[i].getGradePhysics());
        }        
        
    }
}