// Exercise 6.1
import javax.swing.JOptionPane;

public class ChoosingOption{
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do Hoang Kim Tri Thanh 20210798 want to change the first class ticket?");
		JOptionPane.showMessageDialog(null,
				"Hoang Kim Tri Thanh 20210798 has choosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
		System.exit(0);
	}
}