import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args){
        String strA,strB,strC;
        strA = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input a:",
        "Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input b:",
        "Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input c:",
        "Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = Integer.parseInt(strC);
        if(a==0){
            if(b==0){
                if(c==0){
                    JOptionPane.showMessageDialog(null,"Phuong trinh co vo so nghiem",
                    "Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Phuong trinh co vo nghiem",
                    "Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                String strNotification = "Phuong trinh co nghiem duy nhat:\nx="+(double) -c/b;
                JOptionPane.showMessageDialog(null,strNotification,"Hoang Kim Tri Thanh 20210798-Quadratic Equation",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            int delta = b*b - 4*a*c;
            if(delta==0){
                String strNotification = "Phuong trinh co nghiem kep:\nx1=x2="+(double) -b/(2*a);
                JOptionPane.showMessageDialog(null,strNotification,"Hoang Kim Tri Thanh 20210798-Quadratic Equation",
                JOptionPane.INFORMATION_MESSAGE);
            }else if(delta<0){
                JOptionPane.showMessageDialog(null,"Phuong trinh co vo nghiem","Hoang Kim Tri Thanh 20210798-Quadratic Equation",
                JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"x1="+(double)(-b+Math.sqrt((double)delta))/(2*a)+"\nx2="+(double)(-b-Math.sqrt((double)delta))/(2*a),"Hoang Kim Tri Thanh 20210798-Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}