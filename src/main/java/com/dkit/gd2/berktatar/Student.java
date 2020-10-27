package com.dkit.gd2.berktatar;

import java.util.ArrayList;

public class Student
{
    private String Student_Number;
    private int Subject_Code1;
    private int Mark1;

    private int Subject_Code2;
    private int Mark2;

    private int Subject_Code3;
    private int Mark3;

    private int Subject_Code4;
    private int Mark4;

    private int Subject_Code5;
    private int Mark5;

    private int Subject_Code6;
    private int Mark6;

    private int Subject_Code7;
    private int Mark7;

    private int Subject_Code8;
    private int Mark8;

    public Student(String Student_Number, int Subject_Code1, int Mark1, int Subject_Code2, int Mark2, int Subject_Code3, int Mark3, int Subject_Code4, int Mark4,int Subject_Code5, int Mark5,int Subject_Code6, int Mark6, int Subject_Code7, int Mark7, int Subject_Code8, int Mark8)
    {
        this.Student_Number = Student_Number;
        this.Subject_Code1 = Subject_Code1;
        this.Mark1 = Mark1;
        this.Subject_Code2 = Subject_Code2;
        this.Mark2 = Mark2;
        this.Subject_Code3 = Subject_Code3;
        this.Mark3 = Mark3;
        this.Subject_Code4 = Subject_Code4;
        this.Mark4 = Mark4;
        this.Subject_Code5 = Subject_Code5;
        this.Mark5 = Mark5;
        this.Subject_Code6 = Subject_Code6;
        this.Mark6 = Mark6;
        this.Subject_Code7 = Subject_Code7;
        this.Mark7 = Mark7;
        this.Subject_Code8 = Subject_Code8;
        this.Mark8 = Mark8;
    }

    public String getStudent_Number()
    {
        return Student_Number;
    }

    public int getSubject_Code1()
    {
        return Subject_Code1;
    }

    public int getMark1()
    {
        return Mark1;
    }

    public int getSubject_Code2()
    {
        return Subject_Code2;
    }

    public int getMark2()
    {
        return Mark2;
    }

    public int getSubject_Code3()
    {
        return Subject_Code3;
    }

    public int getMark3()
    {
        return Mark3;
    }

    public int getSubject_Code4()
    {
        return Subject_Code4;
    }

    public int getMark4()
    {
        return Mark4;
    }

    public int getSubject_Code5()
    {
        return Subject_Code5;
    }

    public int getMark5()
    {
        return Mark5;
    }

    public int getSubject_Code6()
    {
        return Subject_Code6;
    }

    public int getMark6()
    {
        return Mark6;
    }

    public int getSubject_Code7()
    {
        return Subject_Code7;
    }

    public int getMark7()
    {
        return Mark7;
    }

    public int getSubject_Code8()
    {
        return Subject_Code8;
    }

    public int getMark8()
    {
        return Mark8;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "Student_Number='" + Student_Number + '\'' +
                ", Subject_Code1='" + Subject_Code1 +
                ", Mark1=" + Mark1 +
                ", Subject_Code2='" + Subject_Code2 +
                ", Mark2=" + Mark2 +
                ", Subject_Code3='" + Subject_Code3 +
                ", Mark3=" + Mark3 +
                ", Subject_Code4='" + Subject_Code4 +
                ", Mark4=" + Mark4 +
                ", Subject_Code5='" + Subject_Code5 +
                ", Mark5=" + Mark5 +
                ", Subject_Code6='" + Subject_Code6 +
                ", Mark6=" + Mark6 +
                ", Subject_Code7='" + Subject_Code7 +
                ", Mark7=" + Mark7 +
                ", Subject_Code18='" + Subject_Code8 +
                ", Mark8=" + Mark8 +
                '}';
    }
}
