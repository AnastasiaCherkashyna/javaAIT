package Homework27;

public class CameraOperator extends FilmStudioEmployee{

    public CameraOperator(String name, String position, double experienceYears) {
        super(name, position, experienceYears);
    }

    public void operateCamera() {
        super.work();
        System.out.println(getPosition() + " " + getName() + " films a movie.");
    }
}
