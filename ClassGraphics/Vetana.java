package ClassGraphics;
import javax.swing.JFrame;
public class Vetana extends JFrame{
    
    public Vetana(){
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Ventan());
        setBounds(0,0,800,800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String agrs[]){
        new Vetana();
    }
}
