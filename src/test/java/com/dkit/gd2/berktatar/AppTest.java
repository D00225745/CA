package com.dkit.gd2.berktatar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void getAverageAge()
    {
        ArrayList<Integer> interests = new ArrayList<>();
        interests.add(1);
        interests.add(2);
        interests.add(3);
        interests.add(4);
        Student stephen = new Student("Stephen", "Drogheda", 20, interests);
        Student zak = new Student("Zak", "Mornington", 18, interests);
        Student berk = new Student("Berk", "Dundalk", 30, interests);
        Student oisín = new Student("Oisín", "Drogheda", 8, interests);
        ArrayList<Student> people = new ArrayList<>();
        people.add(stephen);
        people.add(zak);
        people.add(berk);
        people.add(oisín);
        assertEquals(19.0, App.getAverageAge(people), 0.1);
    }
}
