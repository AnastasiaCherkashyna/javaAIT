package homework33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnitTasksTest {

    private JUnitTasks jUnitTasks;
    private List<Student> students;

    @BeforeEach
    void setUp() {
        jUnitTasks = new JUnitTasks();
        students = new ArrayList<>();

    }


    @Test
    void maxNumberTestPositive() {
        assertEquals(9, jUnitTasks.maxNumber(9,5));
    }



    @Test
    void maxNumberTestNegative() {
        assertEquals(9, jUnitTasks.maxNumber(2, 3));
    }

    @Test
    void maxNumberTestNegativeNumbers() {
        assertEquals(-5, jUnitTasks.maxNumber(-5, -9));
    }

    @Test
    void findMinTestPositive(){
        int [] ArrayList = {4,6,2,8,1,5,4};
        assertEquals(1,jUnitTasks.findMin(ArrayList));
    }

    @Test
    void toUpperCaseStringTestPositive(){
        assertEquals("COLA", jUnitTasks.toUpperCaseString("cola"));
    }

    @Test
    void toUpperCaseStringTestNegative(){
        assertEquals("COla", jUnitTasks.toUpperCaseString("cola"));
    }

    @Test
    void toUpperCaseStringTestIsNull(){
        assertEquals("COLA", jUnitTasks.toUpperCaseString(""));
    }

    @Disabled ("Method is not ready. Ticket 1234")
    void isOddTest() {
        assertTrue(jUnitTasks.isOdd(4));
    }


    @Test
    void filterStudentsTest(){
        students.add(new Student("Alex", 80));
        students.add(new Student("Nina", 80));
        students.add(new Student("John", 99));
        students.add(new Student("Paul", 30));
        List<Student>filterStudentsTest = jUnitTasks.filterStudents(students);
        assertFalse(filterStudentsTest.isEmpty()); // пустой ли список
        assertEquals(3, filterStudentsTest.size()); // каков размер списка
        assertEquals("Alex", filterStudentsTest.get(0).getName()); // на каком месте стоит Алекс
        // если студент не попал в список, тогда он выпадает и список сдвигается. Нина становится на позиц 0
    }
    @Test
    void sortArrayTest(){
        int []numbers = {3,5,2,6,1,7};
        int []sortedNumbers = {1,2,3,5,6,7};
        assertArrayEquals(sortedNumbers, jUnitTasks.sortArray(numbers));
        assertNotEquals(numbers, jUnitTasks.sortArray(sortedNumbers));


    }





}
