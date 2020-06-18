import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String [] args){
        JFrame jframe = new JFrame();
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
