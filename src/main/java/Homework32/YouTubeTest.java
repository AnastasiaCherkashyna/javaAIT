package Homework32;

public class YouTubeTest {
    public static void main(String[] args) {
        User user = new User(1, "Alex");
        User userYouTube = new User(2, "Gim");
        Video video = new Video("7.05.2024", 1,"Star War", 20);

        user.addVideo(video);
        user.getVideoInfo();
        video.addComment(userYouTube, "23.3.3", "🥰");
        video.addLike();
        video.addViews();
        user.getVideoInfo();
    }
}
// дописать код с занятия