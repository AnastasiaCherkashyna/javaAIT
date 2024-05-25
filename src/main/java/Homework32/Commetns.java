package Homework32;

public class Commetns extends Content {
    private String text;

    public Commetns(User user, String creationDate, String text) {
        super(user, creationDate);
        this.text = text;
    }

    @Override
    public String toString() {
        return "Commetns{" +
                "text='" + text;
    }
}
