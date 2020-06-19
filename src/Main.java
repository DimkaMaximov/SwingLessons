import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Main {
    public static void main (String [] args){
        getJFrame();

//        String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // получить список шрифтов
//        for (String s: fonts){
//            System.out.println(s);
//        }

    }
    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            Font font = new Font("Times new roman", Font.ITALIC, 20);
            g.setFont(font);
            g.drawString("Hello!", 20,20);
            g.drawLine(15, 25, 100, 25);
            Line2D line2d = new Line2D.Double(15,30,100,30);
            Ellipse2D eclipse2d = new Ellipse2D.Double(50, 50, 100,100);
            g2d.draw(line2d);
            g2d.draw (eclipse2d);
            g2d.setPaint(Color.RED); // установить цвет закраски
            g2d.fill (eclipse2d); // закрасить заданым цветом

        }
    }
    static void getJFrame(){
        JFrame jframe = new JFrame();
        jframe.add (new MyComponent());
        jframe.setTitle("ТЕСТ");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        ImageIcon  imgi = new ImageIcon("src/fox.png");
        jframe.setIconImage(imgi.getImage());
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //набор инструментов со стандартными настройками
        Dimension dimension = toolkit.getScreenSize(); //получить разрешение экрана
        jframe.setLocation(dimension.width/3, dimension.height/5);
    }
}
