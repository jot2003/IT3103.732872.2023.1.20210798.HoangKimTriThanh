package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; //To keep track of how many DigitalVideoDiscs are in the cart

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) { // Not already full
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Tri Thanh: The disc has been added");
        } else { // Full
            System.out.println("Tri Thanh: The cart is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] discList) {
        int numbersOrdered = discList.length;
        if ((qtyOrdered + numbersOrdered - 1) < MAX_NUMBERS_ORDERED) { //Not full yet
            for (DigitalVideoDisc x : discList) {
                itemsOrdered[qtyOrdered] = x;
                qtyOrdered++;
            }
            System.out.println("Tri Thanh: The disc's list has been added");
        } else { //Full
            System.out.println("Tri Thanh: The cart is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if ((qtyOrdered + 1) < MAX_NUMBERS_ORDERED) { // Not already full
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("Tri Thanh: Two disc has been added");
        } else { // Full
            System.out.println("Tri Thanh: The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                // Tri Thanh: Put the element behind
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("Tri Thanh: The disc has been remove");
                return;
            }
        }
        System.out.println("Tri Thanh: Can't find this disc");
    }

    public float totalCost() {
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString() + ": " + itemsOrdered[i].getCost() + " $");
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Tri Thanh: DVD founded:");
                System.out.println(itemsOrdered[i].toString() + ": " + itemsOrdered[i].getCost() + " $");
                return;
            }
        }
        System.out.println("Tri Thanh: No match found with id: " + id);
    }

    public void searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Tri Thanh: DVD founded:");
                System.out.println(itemsOrdered[i].toString() + ": " + itemsOrdered[i].getCost() + " $");
                return;
            }
        }
        System.out.println("Tri Thanh: No match found with title: " + title);
    }

}