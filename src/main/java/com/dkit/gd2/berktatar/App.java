package com.dkit.gd2.berktatar;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //First need to store multiple people
        //I'm not sure how many people are going to be in the file
        ArrayList<Student> people = new ArrayList<>();
        readPeopleFromFile(people);
        System.out.println(Arrays.toString(people.toArray()));
        writePeopleToFile(people);
        System.out.println(getAverageAge(people));
    }

    private static void readPeopleFromFile(ArrayList<Student> people)
    {
        //Should use try with resources
        //Should also use BufferedReader
        try(Scanner peopleFile = new Scanner(new BufferedReader(new FileReader("students_jc_results.txt"))))
        {
            while(peopleFile.hasNextLine())
            {
                String input = peopleFile.nextLine();
                String[] data = input.split(",");
                String Student_Number = data[0];
                String Subject_Code = data[1];
                int Mark = Integer.parseInt(data[2]);
                ArrayList<Integer> tempList = new ArrayList<>();
                for(int i=3;i<data.length;i++)
                {
                    tempList.add(Integer.parseInt(data[i]));
                }
                people.add(new Student(Student_Number, Subject_Code, Mark, tempList));
            }
        }
        catch(FileNotFoundException fne)
        {
            System.out.println("Could not open students_jc_results.txt");
        }
    }

    private static void writePeopleToFile(ArrayList<Student> people)
    {
        //Try with resources
        //BufferedWriter
        try(BufferedWriter personsFile = new BufferedWriter(new FileWriter("persons.txt")))
        {
            for(Student student : people)
            {
                personsFile.write(student.getStudent_Number()+","+ student.getSubject_Code()+","+ student.getMark());
                for(int i = 0; i < student.getInterests().size(); i++)
                {
                    personsFile.write("," + student.getInterests().get(i));
                }
                personsFile.write("\n");
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }

    protected static double getAverageAge(ArrayList<Student> people)
    {
        int ageSum = 0;
        for(Student student : people)
        {
            ageSum += student.getMark();
        }
        return (double)ageSum/people.size();
    }
}
