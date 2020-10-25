package com.dkit.gd2.berktatar;

import java.util.ArrayList;

public class Student
{
    private String Student_Number;
    private String Subject_Code;
    private int Mark;
    private ArrayList<Integer> interests;

    public Student(String Student_Number, String Subject_Code, int Mark, ArrayList<Integer> interests)
    {
        this.Student_Number = Student_Number;
        this.Subject_Code = Subject_Code;
        this.Mark = Mark;
        this.interests = interests;
    }

    public String getStudent_Number()
    {
        return Student_Number;
    }

    public String getSubject_Code()
    {
        return Subject_Code;
    }

    public int getMark()
    {
        return Mark;
    }

    public ArrayList<Integer> getInterests()
    {
        return interests;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "Student_Number='" + Student_Number + '\'' +
                ", Subject_Code='" + Subject_Code + '\'' +
                ", Mark=" + Mark +
                ", interests=" + interests +
                '}';
    }
}
