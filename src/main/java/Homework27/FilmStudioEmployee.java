package Homework27;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private double experienceYears;

    public void work() {
        System.out.println(name + " currently works as " + position + " for " + experienceYears + " years.");
    }

    public FilmStudioEmployee(String name, String position, double experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "name " + name + "; " + "position " + position + "; " + "experienceYears " + experienceYears;
    }
}
