package homework29;

public class TestGallery {
    public static void main(String[] args) {
        Artwork monaLisa = new Painting("braun", 40, "Da Vinci");
        Artwork venera = new Sculpture("marmor", 2, "MA");

        ArtGallery artGallery = new ArtGallery();

        artGallery.addArtwork(monaLisa);
        artGallery.addArtwork(venera);


        artGallery.displayAllArtworks();
    }
}
