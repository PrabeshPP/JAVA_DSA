import javax.swing.JOptionPane;

public class h {
    public static void main(String[] args) {
        //Finding the hypotenuse of Triangle

        double p,b,h;
        JOptionPane.showMessageDialog(null,"Hello User! This program was created to find the hypotenuse of the triangle");
        b=Double.parseDouble(JOptionPane.showInputDialog("Enter the base of triangle :" ));
        p=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the perpendicular of the triangle :"));
        h=Math.sqrt(Math.pow(b, 2)+Math.pow(p, 2));
        JOptionPane.showMessageDialog(null,"The hypotenuse of the triangle is "+h);
        
        
    }
    
}
