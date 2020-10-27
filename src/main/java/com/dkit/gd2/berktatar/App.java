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
                int Subject_Code1 = Integer.parseInt(data[1]);
                int Mark1 = Integer.parseInt(data[2]);
                int Subject_Code2 = Integer.parseInt(data[3]);
                int Mark2 = Integer.parseInt(data[4]);
                int Subject_Code3 = Integer.parseInt(data[5]);
                int Mark3 = Integer.parseInt(data[6]);
                int Subject_Code4 = Integer.parseInt(data[7]);
                int Mark4 = Integer.parseInt(data[8]);
                int Subject_Code5 = Integer.parseInt(data[9]);
                int Mark5 = Integer.parseInt(data[10]);
                int Subject_Code6 = Integer.parseInt(data[11]);
                int Mark6 = Integer.parseInt(data[12]);
                int Subject_Code7 = Integer.parseInt(data[13]);
                int Mark7 = Integer.parseInt(data[14]);
                int Subject_Code8 = Integer.parseInt(data[15]);
                int Mark8 = Integer.parseInt(data[16]);

                people.add(new Student(Student_Number, Subject_Code1, Mark1, Subject_Code2, Mark2, Subject_Code3, Mark3, Subject_Code4, Mark4, Subject_Code5, Mark5, Subject_Code6, Mark6, Subject_Code7, Mark7, Subject_Code8, Mark8));
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
        try(BufferedWriter personsFile = new BufferedWriter(new FileWriter("students.txt")))
        {
            for(Student student : people)
            {
                personsFile.write(student.getStudent_Number()+","+ student.getSubject_Code1()+","+ student.getMark1()+","+ student.getSubject_Code2()+","+ student.getMark2()+","+ student.getSubject_Code3()+","+ student.getMark3()+","+ student.getSubject_Code4()+","+ student.getMark4()+","+ student.getSubject_Code5()+","+ student.getMark5()+","+ student.getSubject_Code6()+","+ student.getMark6()+","+ student.getSubject_Code7()+","+ student.getMark7()+","+ student.getSubject_Code8()+","+ student.getMark8());

                personsFile.write("\n");
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }


}
