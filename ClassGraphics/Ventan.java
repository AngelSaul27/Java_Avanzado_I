package ClassGraphics;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ventan extends JPanel{
    
   public Ventan(){
       setBounds(0,0,800,800);
       //setBackground(Color.BLACK);
   }
    
   @Override
    public void paint(Graphics g){
        super.paint(g);//Obligatorio
        
        g.setColor(Color.black);
        g.drawLine(0, 70, 100, 70); //LINEA RECTA
        g.drawLine(0, 70, 100, 170); //LINEA RECTA
        g.drawRect(150, 70, 50, 70);
        g.drawRoundRect(250, 70, 50, 70,6,6);
    }
}
