<<<<<<< HEAD
package hust.soict.hedspi.aims.store;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;


public class Store {
	private static final int STORE_LIMIT = 10;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(0, media);
        System.out.println("Added " + media.toString() + " successfully.");
=======
package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Phu 20215116: addMedia and removeMedia method
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Already has this media");
        } else {
            itemsInStore.add(media);
            System.out.println("Media added successfully");
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
        }

    public void removeMedia(Media media) {
<<<<<<< HEAD
        try {
            if (itemsInStore.remove(media)) {
                System.out.println("Removed " + media.toString() + " from store.");
            } else {
                System.out.println("Couldn't find this item.");
=======
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media remove successfully");
        } else
            System.out.println("Media not found");
    }

    public static void showMenu() {
        System.out.println("AIMS");
        System.out.println("---------------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("---------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options");
        System.out.println("------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("---------------------------------");
        System.out.println("Please choose a number : 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options");
        System.out.println("----------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("---------------------------------");
        System.out.println("Please choose a number : 0-1-2");
    }

    public Media searchTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
            }
        } catch (Exception e) {
            System.err.println("Error removing media from store: " + e.getMessage());
            e.printStackTrace();
        }
<<<<<<< HEAD
    }

    public Media fetchMedia(String title) {
        try {
            for (Media m : itemsInStore) {
                if (m.isMatch(title))
                    return m;
            }
        } catch (Exception e) {
            System.err.println("Error fetching media from store: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
=======
        return null;
    }
}
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
