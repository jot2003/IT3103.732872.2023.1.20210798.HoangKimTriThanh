<<<<<<< HEAD
package hust.soict.hedspi.aims.cart;
=======
package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc

import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart {
<<<<<<< HEAD

	public static final int MAX_NUMBERS_ORDERED = 20;

	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

	public void addMedia(Media media) {
		
		
		itemsOrdered.add(media);
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.remove(media)) {
			System.out.println("Removed " + media.toString() + " from cart.");
		} else {
			System.out.println("Couldn't find this item.");
		}
	}

	public float totalCost() {
        float cost = 0;
        try {
            for (Media m : itemsOrdered) {
                cost += m.getCost();
            }
        } catch (Exception e) {
            System.err.println("Error calculating total cost: " + e.getMessage());
            e.printStackTrace();
=======
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
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
        }
        return cost;
    }

<<<<<<< HEAD
	public void searchById(int id) {
        System.out.println("Search results for ID: " + id);
        try {
            for (Media m : itemsOrdered) {
                if (m.getId() == id) {
                    System.out.println(m.toString());
                    return;
                }
=======
    //  search by id and by title method
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Tri Thanh Media founded:");
                System.out.println(media.toString());
                return;
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
            }
        } catch (Exception e) {
            System.err.println("Error searching by ID: " + e.getMessage());
            e.printStackTrace();
        }
<<<<<<< HEAD
        System.out.println("No items found.");
    }

	public void searchByTitle(String title) {
		boolean found = false;
		System.out.println("Search results for keywords: " + title);
		for (Media m : itemsOrdered) {
			if (m.isMatch(title)) {
				System.out.println(m.toString());
				found = true;
			}
		}
		if (!found)
			System.out.println("No items found.");
	}

	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	public Media fetchMedia(String title) {
        try {
            for (Media m : itemsOrdered) {
                if (m.isMatch(title))
                    return m;
=======
        System.out.println("Tri Thanh No match found with id: " + id);
    }

    public void searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println("Tri Thanh Media founded:");
                System.out.println(media.toString());
                return;
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
            }
        } catch (Exception e) {
            System.err.println("Error fetching media: " + e.getMessage());
            e.printStackTrace();
        }
<<<<<<< HEAD
        return null;
    }
	public void placeOrder() {
		itemsOrdered.clear();
	}

	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
=======
        System.out.println("Tri Thanh No match found with title: " + title);
    }
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
}