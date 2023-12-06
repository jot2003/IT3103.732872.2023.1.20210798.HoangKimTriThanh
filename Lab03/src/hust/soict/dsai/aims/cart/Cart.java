package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    //  addMedia and removeMedia method
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Already has this media");
        } else {
            itemsOrdered.add(media);
            System.out.println("Media added successfully");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media remove successfully");
        } else
            System.out.println("Media not found");
    }

    //  get total cost method
    public float totalCost() {
        float cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }
        return cost;
    }

    //  search by id and by title method
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Tri Thanh Media founded:");
                System.out.println(media.toString());
                return;
            }
        }
        System.out.println("Tri Thanh No match found with id: " + id);
    }

    public void searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println("Tri Thanh Media founded:");
                System.out.println(media.toString());
                return;
            }
        }
        System.out.println("Tri Thanh No match found with title: " + title);
    }
}