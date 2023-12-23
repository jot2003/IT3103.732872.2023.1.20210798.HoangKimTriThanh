<<<<<<< HEAD
package hust.soict.hedspi.aims.media;

import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {

    // Modified in lab 04
    public DigitalVideoDisc() {

    }

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public boolean equals(DigitalVideoDisc disc1) {
        if (disc1 == null || this == null)
            return false;
        if (!disc1.getTitle().equals(super.getTitle()))
            return false;
        return true;
    }

    public boolean isMatch(String title) {
        if (super.getTitle().equals(title)) {
            return true;
        }
        return false;
    }
    public static DigitalVideoDisc createDVD() {
		System.out.println("---New DVD---");
		String title, category, director;
		int length;
		float cost;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		title = sc.nextLine();

		System.out.print("Enter category: ");
		category = sc.nextLine();

		System.out.print("Enter director: ");
		director = sc.nextLine();

		System.out.print("Enter length: ");
		length = sc.nextInt();

		System.out.print("Enter cost: ");
		cost = sc.nextFloat();

		return new DigitalVideoDisc(title, category, cost,length, director);
	}

	@Override
	public void play() throws PlayerException {
			if (this.getLength() > 0) {
				StringBuilder sb = new StringBuilder();
				sb.append("Playing DVD: " + this.getTitle() + "\n");
				sb.append("DVD length: " + this.getLength() + "\n");
				JOptionPane.showMessageDialog(null, sb.toString(), "Play DVD", JOptionPane.INFORMATION_MESSAGE);
			} else {
				throw new PlayerException("ERROR: DVD length is non-positive!");
			}
	}

=======
package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    // Tri Thanh 210798: Modified in lab 04
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
    @Override
    public String toString() {
        return "DVD - " + super.toString();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
