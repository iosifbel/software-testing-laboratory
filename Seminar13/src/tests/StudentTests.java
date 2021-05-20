package tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametru() {
        String nume = "Gigel";
        Student student = new Student(nume);

        assertEquals(nume,student.getNume());
    }

    @Test
    public void testConstructorFaraParametru(){
        Student student = new Student();
        assertEquals("Student", student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student = new Student();
        student.adaugaNota(10);
        assertEquals(1,student.getNote().size());
    }

    @Test
    public void testNotaAdaugataEsteCorecta(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testAreRestanta() {
        Student student = new Student();
        student.adaugaNota(3);
        student.adaugaNota(10);
        assertTrue("Studentul restantier este marcat ca neavand restante",student.areRestante());
    }

    @Test
    public void testnuAreRestante(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(10);
        assertFalse("Studentul nerestantier este marcat ca avand restante",student.areRestante());
    }
}
