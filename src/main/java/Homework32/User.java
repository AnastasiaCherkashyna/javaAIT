package Homework32;

import java.util.HashMap;

public class User {
    public Interactable video;
    private int id;
    private String name;
    private HashMap<Integer, Video> videos = new HashMap<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addVideo (Video video) {
        video.setUser(this);
        videos.put(video.getId(), video);
    }

    public void removeVideo (int videoId) {
        videos.remove(videoId);
        System.out.println("Removed video " + videoId);
    }

    public void getVideoInfo (){
        System.out.println("User " + name + " has" + videos.size() + " videos.");
        for (Video video : videos.values()){
            System.out.println(video);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", videos=" + videos +
                '}';
    }
}
