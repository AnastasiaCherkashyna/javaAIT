package Homework27;

public class SoundEngineer extends FilmStudioEmployee {

    public SoundEngineer(String name, String position, double experienceYears) {
        super(name, position, experienceYears);
    }

    public void recordSound() {
        super.work();
        System.out.println(getPosition() + " " + getName() + " manages a sound.");
    }
}

