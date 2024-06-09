package Homework32;

import java.util.ArrayList;
import java.util.Objects;

public class Video extends Content implements Interactable {
    private int id;
    private String title;
    private int duration;
    private int views;
    private int likes;
    private int dislikes;
    private ArrayList<Commetns> comments = new ArrayList<>();

    public Video(String creationDate, int id, String title, int duration) {
        super(creationDate);
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", views=" + views +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id == video.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public void addLike() {
        likes++;

    }

    @Override
    public void addDislike() {
        dislikes++;

    }

    @Override
    public void addViews() {
        views++;

    }

    @Override
    public void addComment(User user, String creationDate, String text) {
        Commetns commetn = new Commetns(user, creationDate, text);
        comments.add(commetn);

    }



    }

