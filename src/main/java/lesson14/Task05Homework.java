package lesson14;

public class Task05Homework {
    public static void main(String[] args) {
        // First Array
        String[] hobbies = new String[4];
        hobbies[0] = "traveling";
        hobbies[1] = "reading books";
        hobbies[2] = "swimming";
        hobbies[3] = "playing piano";

        String[] hobbiesNew = new String[2];
        hobbiesNew[0] = "Cooking";
        hobbiesNew[1] = "Walking";


        String[] allHobbies = new String[6];
        for (int i = 0; i < hobbies.length; i++) {
            allHobbies[i] = hobbies[i];
        }
        System.arraycopy(hobbiesNew, 0, allHobbies, 0 + hobbies.length, hobbiesNew.length);
        System.out.println("Полный список ваших хобби: ");
        for (String all : allHobbies)
            System.out.println(all);


         /* String [] all ( String[]hobbies, String []hobbiesNew){
            String[] allHobbies = new String[hobbies.length + hobbiesNew.length];
            System.arraycopy(hobbies, 0, allHobbies, 0, hobbies.length);
            System.arraycopy(hobbiesNew, 0, allHobbies, hobbies.length, hobbiesNew.length);
            return allHobbies;
        } */
    }
}

