package Homework27;

import java.util.HashSet;

public class MovieSet {
    public static void main(String[] args) {

        Director director = new Director("Jack", "director", 10);
        CameraOperator cameraOperator = new CameraOperator("Robbin", "cameraman", 4);
        SoundEngineer soundEngineer = new SoundEngineer("Bill", "soundengineer", 5);


        HashSet<FilmStudioEmployee> simulateDayOfWork = new HashSet<>();

        simulateDayOfWork.add(director);
        simulateDayOfWork.add(cameraOperator);
        simulateDayOfWork.add(soundEngineer);

        simulateDayOfWork.forEach(FilmStudioEmployee::work);

        System.out.println("-----2-----");

        director.direct();
        cameraOperator.operateCamera();
        soundEngineer.recordSound();

    }
}
