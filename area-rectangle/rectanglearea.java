import javax.swing.JOptionPane;
public class rectanglearea{
    public static void main (String[] args){
        String width, length;
        int area;

        width = JOptionPane.showInputDialog("Rectangle Width");
        Integer.parseInt(width);
        
        length = JOptionPane.showInputDialog("Rectangle Length");
        Integer.parseInt(length);
        
        area = Integer.parseInt(width) * Integer.parseInt(length);
        
        JOptionPane.showMessageDialog(null, area, "Rectangle Area", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
