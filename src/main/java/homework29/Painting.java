package homework29;

public class Painting implements Artwork{
    private String colorType;
    private double size;
    private String creator;



    public Painting(String colorType, double size, String creator) {
        this.colorType = colorType;
        this.size = size;
        this.creator = creator;
    }

    public String getColorType() {
        return colorType;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painting von " + creator);
         // прописать

    }

    @Override
    public String getCreator() {
        return getCreator();

    }

    @Override
    public String toString() {
        return "Painting{" +
                "colorType='" + colorType + '\'' +
                ", size=" + size +
                ", creator='" + creator + '\'' +
                '}';
    }
}
