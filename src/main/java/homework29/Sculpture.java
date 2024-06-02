package homework29;

public class Sculpture implements Artwork{

    private String material;
    private double weight;
    private String creator;


    public Sculpture(String material, double weight, String creator) {
        this.material = material;
        this.weight = weight;
        this.creator = creator;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painting von " + creator); // прописать
    }

    @Override
    public String getCreator() {
        return getCreator();
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", creator='" + creator + '\'' +
                '}';
    }
}
