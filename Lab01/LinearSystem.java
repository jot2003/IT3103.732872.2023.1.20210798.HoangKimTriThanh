//A system of first-degree equations with two variables x1 and x2 can be written as follows.
//a11.x1+a12.x2=b1  
//a21.x1+a22.x2=b2  

import javax.swing.JOptionPane;

public class LinearSystem {
    public static void main(String[] args){
        //Khai báo xâu để lâu a11,a12,a21,a22 nhận từ dialog
        String strA11;
        String strA12;
        String strA21;
        String strA22;
        String strB1;
        String strB2;
        //Nhập a11,a12,a21,a22 từ dialog
        strA11 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input a11:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input a12:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input b1:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input a21:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        strA22 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input a22:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null, "Hoang Kim Tri Thanh 20210798-Please input b2:","Hoang Kim Tri Thanh 20210798-Linear System",
        JOptionPane.INFORMATION_MESSAGE);
        //Chuyển đổi từ xâu sang số thực
        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;
        //Sử dụng công thức nghiệm x1 = D1/D, x2 = D2/D
        if(D==0&&D1==0&&D2==0){ //Nếu cả D = D1 = D2 = 0 => Phương trình vô số nghiệm
            JOptionPane.showMessageDialog(null,"Phuong trinh vo so nghiem","Hoang Kim Tri Thanh 20210798-Show:",
            JOptionPane.INFORMATION_MESSAGE);
        }else if(D==0){ //Nếu chỉ D = 0 => Phương trình vô nghiệm
            JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem","Hoang Kim Tri Thanh 20210798-Show:",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            //Trường hợp D khác 0 luôn có nghiệm
            String strNotification1 = "x1="+D1/D;
            String strNotification2 = "x2="+D2/D;
            //In ra Dialog 2 nghiệm x1 và x2
            JOptionPane.showMessageDialog(null, strNotification1,"Hoang Kim Tri Thanh 20210798 Show:",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, strNotification2,"Hoang Kim Tri Thanh 20210798 Show:",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
}