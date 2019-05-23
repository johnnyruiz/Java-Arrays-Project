package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    Student(String Name){
        this.name = Name;
    }





    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (var i = 0; i < this.grades.size();i++){
            sum += grades.get(i);
        }
        return sum/grades.size();



    }

    public void addGrade(int Grade){
        this.grades.add(Grade);
    }

    public void addGrade(int Grade1,int Grade2,int Grade3,int Grade4,int Grade5){
        this.grades.add(Grade1);
        this.grades.add(Grade2);
        this.grades.add(Grade3);
        this.grades.add(Grade4);
        this.grades.add(Grade5);
    }


