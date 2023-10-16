//Hoang Kim Tri Thanh - 20210798
// Example 5
import javax.swing.JOptionPane;
public class DoubleNumbers {
		public static void main(String[] args) {
			String strNum1,strNum2;
			strNum1=JOptionPane.showInputDialog(null,
					"Hoang Kim Tri Thanh-20210798- Enter the first number: ","The first number",
					 JOptionPane.INFORMATION_MESSAGE);
			strNum2=JOptionPane.showInputDialog(null,
					"Hoang Kim Tri Thanh-20210798- Enter the second number: ","The second number",
					 JOptionPane.INFORMATION_MESSAGE);
			double num1,num2;
			num1=Double.parseDouble(strNum1);
			num2=Double.parseDouble(strNum2);
			JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\n"+
												"Difference: "+(num1-num2)+"\n"+
												"Product: "+(num1*num2)+"\n"+
												"Quotient: "+(num1/num2)+"\n");
		}
}
