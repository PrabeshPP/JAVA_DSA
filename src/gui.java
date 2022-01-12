import javax.swing.JOptionPane;


public class gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

       int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
       JOptionPane.showMessageDialog(null,"Your age is "+age);

       double pie=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the value of Pie"));
       JOptionPane.showMessageDialog(null,"The value of Pie is "+pie);
    }
}
