<<<<<<< HEAD
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import hust.soict.hedspi.aims.exception.PlayerException;


public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		super();
	}

	public CompactDisc(String title) {
		super(title);
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public CompactDisc(String title, String category, String artist, float cost) {
		this(title, category, cost);
		this.artist = artist;
	}

	public CompactDisc(String title, String category, String artist, String director, float cost) {
		this(title, category, artist, cost);
		this.director = director;
	}

=======
package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

	// Tri Thanh 210798 lab04
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
	}

	// Tri Thanh 210798: Getter method for artist
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
	public String getArtist() {
		return artist;
	}

<<<<<<< HEAD
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track already exists.");
		} else {
			tracks.add(track);
			System.out.println("Added track " + track.getTitle() + " to CD.");
		}
	}

	public void removeTrack(Track track) {
		if (tracks.remove(track)) {
			System.out.println("Removed track " + track.getTitle() + " from CD.");
		} else {
			System.out.println("Track doesn't exists.");
		}
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public int getLength() {
		int length = 0;
		for (Track t : tracks) {
			length += t.getLength();
		}
		this.length = length;
		return length;
	}

	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("---CD---\nTitle: %s\nCategory: %s\nArtist: %s\nLength: %dm.\nCost: %.2f $\n", title,
				category, artist, getLength(), cost).replaceAll(" null | 0 ", " Unknown "));
		for (int i = 0; i < tracks.size(); i++)
			sb.append("\nTrack no. " + (i + 1) + "\n" + tracks.get(i).getDetails());
		return sb.toString();
	}

	@Override
	public void play() throws PlayerException {
		if (getLength() > 0) {
			StringBuilder sb = new StringBuilder();

			sb.append("Playing CD: " + this.getTitle() + (this.getArtist().equals("") ? "" : " by " + this.getArtist())
						+ "\n");
			sb.append("CD total length: " + this.getLength() + "\n");
			JOptionPane.showMessageDialog(null, sb.toString(), "Play CD", JOptionPane.INFORMATION_MESSAGE);
			for (Track t : tracks) {
				try {
					t.play(); 
				} catch (PlayerException e) {
					throw e;
				}
			}
		} else {
			throw new PlayerException("ERROR: CD length must be a positive number!");
		}
			
	}

	@Override
	public String toString() {
		return String.format("CD - %s - %s - %s - %dm. : %.2f $", title, category, artist, getLength(), cost)
				.replaceAll(" null | 0 ", " Unknown ");
=======
	// Tri Thanh 210798: add and remove track method
	public void addTrack(Track track) {
		int index = tracks.indexOf(track); // If there is no track, index will be -1
		if (index != -1) {
			System.out.println("Already has track " + track.getTitle());
		} else
			tracks.add(track);
	}

	public void removeTrack(Track track) {
		int index = tracks.indexOf(track);
		if (index != -1) {
			tracks.remove(track);
		} else
			System.out.println("Track " + track.getTitle() + " not found");
	}

	// Tri Thanh 210798: getLength()
	public int getLength() {
		int compactDiscLength = 0;
		for (Track track : tracks) {
			compactDiscLength += track.getLength();
		}
		return compactDiscLength;
	}

	@Override
	public void play() {
		System.out.println("Playing compact disc of artist: " + this.artist);
		System.out.println("Compact disc length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
>>>>>>> c80e12231ada33f8938cbf8cdd39920fac8544fc
	}

}
