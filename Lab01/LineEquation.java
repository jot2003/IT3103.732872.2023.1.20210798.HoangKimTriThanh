//The first-degree equation (linear equation) with one variable 
//ax+b=0
import javax.swing.JOptionPane;
public class LineEquation {
    public static void main(String[] args){
    String strA;
    String strB;
    //Nhập a từ dialog
    strA = JOptionPane.showInputDialog(null, "Hoàng Kim Trí Thành - 20210798 - Enter a:","Hoàng Kim Trí Thành - 20210798 - Enter a",
    JOptionPane.INFORMATION_MESSAGE);
    //Nhập b từ dialog
    strB = JOptionPane.showInputDialog(null, "Hoàng Kim Trí Thành - 20210798 - Enter b:","Hoàng Kim Trí Thành - 20210798 - Enter b",
    JOptionPane.INFORMATION_MESSAGE);
    double a = Double.parseDouble(strA); // chuyển xâu sang số thực
    double b = Double.parseDouble(strB); // chuyển xấu sang số thực
    if(a==0){ //Xử lý trường hợp a = 0
        if(b==0){ //Xử lý trường hợp a=0,b=0 Phương trình có vô số nghiệm 
            JOptionPane.showMessageDialog(null,"Infinite solutions","Hoàng Kim Trí Thành - 20210798 - Answer:", 
            JOptionPane. INFORMATION_MESSAGE);
    }
        else{ //Với b khác 0 thì phương trình vô nghiệm
            JOptionPane.showMessageDialog(null,"No solution","Hoàng Kim Trí Thành - 20210798 - Answer:", 
            JOptionPane. INFORMATION_MESSAGE); 
    }
    }else{ // Với a khác 0 thì luôn có nghiệm
        String strNotification = "x=" + b/a;
        JOptionPane.showMessageDialog(null, strNotification, "Hoàng Kim Trí Thành - 20210798 - Answer:", JOptionPane. INFORMATION_MESSAGE);
        }
    }
}
