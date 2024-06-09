package homework33;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class JUnitTasks {

    public int maxNumber(int numberOne, int numberTwo) {
        int max = 0;
        if (numberOne > numberTwo) {
            max = numberOne;
            System.out.println(max);
        } else {
            max = numberTwo;
            System.out.println(max);
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public String toUpperCaseString(String input) {
        return new StringBuilder(input).toString().toUpperCase();
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public List<Student> filterStudents(List<Student> students) {
        return students.stream().filter(student -> student.getGrade() > 75).collect(Collectors.toList());
    }  // кто такой студент с маленькой буквы на 40й строке?

    public int[] sortArray(int[] array) {  // создаем массив
        int[] sortedArray = array.clone(); // созд копию, тк верно сортировать копию! а не оригинал
        Arrays.sort(sortedArray); // выполняет сортировку
        return sortedArray; // возвращ результат
    }

}
