<<<<<<< HEAD
package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	protected int length;
	protected String director;

	public Disc() {
		super();
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Disc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}

	public Disc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}

=======
package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;

	public Disc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}

	//Getter methods
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
<<<<<<< HEAD

	public Disc(String title, String category, float cost, int length, String director) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}

	public String tostring() {
		return super.toString() + " - " + this.length + " - " + this.director;
	}

}
=======
	public String toString() {
		return "Disc - " + super.toString() + " - " + "Director: " + director + " - " + "Length: " + length;
	}
}
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
