import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student Sam;
    Student Jen;


    @Before
    public void init(){
        Sam = new Student(1, "Sam Arguello");
        Sam.addGrades(100);

        Jen = new Student(2, "Jen Stevens");
        Jen.addGrades(90);
        Jen.addGrades(95);
        Jen.addGrades(100);
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Sam Arguello", Sam.getName());
        assertEquals(1, Sam.getId());
    }

    @Test
    public void ifAddGradeWorks(){
        assertSame(100, Sam.getGrades().get(0));
    }

    @Test
    public void ifGradeAverageWorks(){
        assertEquals(100, Sam.getGradeAverage(), 0);
        assertEquals(95, Jen.getGradeAverage(), 0);
    }
}
