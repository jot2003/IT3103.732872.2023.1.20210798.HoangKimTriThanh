package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; // Class member

    private int id; //Instance member
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //Getter generation

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    //Constructor method generation
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++; // update nbDigitalVideoDisc
        this.id = nbDigitalVideoDiscs; // assign appropriate value for the id
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    @Override
    public boolean equals(Object o) {

        // Override equals method
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /*
         * Check if o is an instance of DigitalVideoDisc or not
         * "null instanceof [type]" also returns false
         */
        if (!(o instanceof DigitalVideoDisc)) {
            return false;
        }

        // typecast o to Complex so that we can compare data
        // members
        DigitalVideoDisc disc = (DigitalVideoDisc) o;

        // Compare the data members and return accordingly
        return length == disc.length
                && cost == disc.cost
                && title.equals(disc.title)
                && category.equals(disc.category)
                && director.equals(disc.director);
    }

    // Overide toString method in session 6
    @Override
    public String toString() {
        return "DVD - " + title + " - " + (category == null ? "Missing category" : category) + " - "
                + (director == null ? "Missing director" : director)
                + " - " + (length <= 0 ? "Missing length" : length);
    }

    // Method for check matching title
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}