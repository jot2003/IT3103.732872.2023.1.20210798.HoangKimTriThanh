<<<<<<< HEAD
package hust.soict.hedspi.aims.media;
import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.exception.PlayerException;
public class Track implements Playable {
    // 
=======
package hust.soict.dsai.aims.media;

public class Track implements Playable {

>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

<<<<<<< HEAD
    //  Getter methods for title and length
=======
    // Getter methods for title and length
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
<<<<<<< HEAD
	public String getDetails() {
		return String.format("Title: %s\nLength: %dm.\n", title, length).replaceAll(" null | 0 ", " Unknown ");
	}
	
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("Playing track: " + this.getTitle() + "\n");
			sb.append("Track length: " + this.getLength() + "\n");
			JOptionPane.showMessageDialog(null, sb.toString(), "Play track", JOptionPane.INFORMATION_MESSAGE);
		} else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}

    @Override
    public boolean equals(Object o) {

        // Override equals method
=======

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object o) {

        // Tri Thanh 210798: Override equals method
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /*
<<<<<<< HEAD
         * Check if o is an instance of Track or not
=======
         * Tri Thanh 210798: Check if o is an instance of Track or not
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
         * "null instanceof [type]" also returns false
         */
        if (!(o instanceof Track)) {
            return false;
        }
        Track track = (Track) o;

<<<<<<< HEAD
        // Compare the data members and return accordingly
=======
        // Tri Thanh 210798: Compare the data members and return accordingly
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
        return title.equals(track.title) && length == track.length;
    }

    @Override
    public String toString() {
        return "Track - " + title + " - " + "Length: " + length;
    }
}
<<<<<<< HEAD

=======
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
