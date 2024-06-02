package homework29;

import java.util.ArrayList;
import java.util.HashSet;

public class ArtGallery {

    private HashSet<Artwork> allArtGallery = new HashSet<>();


    // создали конструктор
    public HashSet<Artwork> getArtGallery() {
        return allArtGallery;
    }

    // Метод добавления работы в список Artwork
    public void addArtwork(Artwork artwork) {
        allArtGallery.add(artwork);
        System.out.println("Artwork " + artwork.toString() + "was added.");
    }

    // поиск по создателю
    public void findArtwork (String creator) {
        boolean checkCreator = false;
        System.out.println(" Search Art by creator: ");
        for (Artwork artwork : allArtGallery) {
            if (artwork.getCreator().equals(creator)) {
                artwork.displayInfo();
            } if (!checkCreator) {
                System.out.println("Creator is not found.");
            }
        }
    }
        // Удаление
    public void removeArtwork(Artwork artwork) {
        System.out.println("Removal of artwork.");
        boolean removeCheck = allArtGallery.remove(artwork);
        if (removeCheck) {
            System.out.println("Removed.");
        } else {
            System.out.println("Art is not in the list.");
        }
    }

    public void filterByArtType(String artType) {
        for (Artwork artwork : allArtGallery) {
            if (artwork.getClass().getSimpleName().equals(artType)) {
                artwork.displayInfo();
            }
        }
    }
        // Вывод всех объектов на экран
    public void displayAllArtworks() {
        System.out.println("All works printing:");
        for (Artwork artwork : allArtGallery)
            artwork.displayInfo();
    }
    // фильтрация произведений по типу
    //фильтарция по типу картины скульптуры
    public HashSet<Artwork> filterdByArtType (String type) {

        HashSet<Artwork> filteredList = new HashSet<>();
        for (Artwork artwork : allArtGallery) {
            if (artwork.getClass().getSimpleName().equals(type)) {
                filteredList.add(artwork);
            }
        }
        if (filteredList.isEmpty()) {
            System.out.println("Objects of type " + type + " was not found!");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println(filteredList.size() + " objects of type " + type + " was found");
            System.out.println("----------------------------------------------");
        }
        return filteredList;
    }
}

