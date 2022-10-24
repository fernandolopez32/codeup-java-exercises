package grades;

public class StudentTest {
    public static void main(String[] args) {

        Students student = new Students("Aaron");
        student.addGrade(67,89,90);

        Students st2 = new Students("Stephen");
        st2.addGrade(99,100,100);

        Students st3 = new Students("Fernando");
        st3.addGrade(87,48,89);

        System.out.println(st3.getGradeAverage());


    }// end of main
}// end of test
