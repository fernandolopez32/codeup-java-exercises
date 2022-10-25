package grades;

import java.util.ArrayList;

public class Students {

    private ArrayList<Integer> Grades;

    public ArrayList<Integer> getGrades() {
        return Grades;
    }

//    public void setGrades(ArrayList<Integer> grades) {
//        Grades = grades;
//    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){
        Grades.add(grade);
    }

    public void addGrade(int g1,int g2, int g3){
        Grades.add(g1);
        Grades.add(g2);
        Grades.add(g3);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double acc = 0;
        for(int i = 0; i < Grades.size(); i++) {
            acc += Grades.get(i);
        }
       return (acc / Grades.size());
    }




    public Students(String name) {
        this.Grades = new ArrayList<>();
        this.name = name;
    }
}
