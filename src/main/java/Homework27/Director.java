package Homework27;

public class Director extends FilmStudioEmployee{

    public Director(String name, String position, double experienceYears) {
        super(name, position, experienceYears);
    }

    public void direct() {
        super.work();
        System.out.println(getPosition() + " " + getName() + " manages a team.");
    }

}
