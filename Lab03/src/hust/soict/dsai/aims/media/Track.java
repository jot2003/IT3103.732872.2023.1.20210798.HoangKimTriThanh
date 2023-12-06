package hust.soict.dsai.aims.media;

public class Track implements Playable {

    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter methods for title and length
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object o) {

        // Tri Thanh 210798: Override equals method
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /*
         * Tri Thanh 210798: Check if o is an instance of Track or not
         * "null instanceof [type]" also returns false
         */
        if (!(o instanceof Track)) {
            return false;
        }
        Track track = (Track) o;

        // Tri Thanh 210798: Compare the data members and return accordingly
        return title.equals(track.title) && length == track.length;
    }

    @Override
    public String toString() {
        return "Track - " + title + " - " + "Length: " + length;
    }
}
