package hust.soict.dsai.aims.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

    public static void main(String[] args) {

        // Create a new Store
        Store store = new Store();

        // Create a new DVD object and add it to the Store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        // Test remove method
        store.removeDVD(dvd1); // can remove

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.removeDVD(dvd3); // can't remove
    }
}