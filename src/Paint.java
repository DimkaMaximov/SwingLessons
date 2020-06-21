import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Paint {

//        String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // получить список шрифтов
//        for (String s: fonts){
//            System.out.println(s);
//        }

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
        Rectangle2D rectangle2d = new Rectangle2D.Double(150,150, 200,200);
        g2d.draw (rectangle2d);

        try {
            URL url = new URL("http://download.seaicons.com/icons/tatice/cristal-intense/256/Java-icon.png");
            Image image = new ImageIcon(url).getImage();
            g2d.drawImage(image, 170,170,null);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



    }
}
    static void getJFrame(){
        JFrame jframe = new JFrame();
        jframe.add (new MyComponent());
        jframe.setTitle("Панель для рисования");
        jframe.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        ImageIcon  imgi = new ImageIcon("src/fox.png");
        jframe.setIconImage(imgi.getImage());
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //набор инструментов со стандартными настройками
        Dimension dimension = toolkit.getScreenSize(); //получить разрешение экрана
        jframe.setLocation(dimension.width/3, dimension.height/5);

        jframe.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent we) {
                JDialog jDialog = new JDialog();
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dimension = toolkit.getScreenSize();
                jDialog.setLocation(dimension.width/7*3, dimension.height/3);
                jDialog.setSize(250,150);
                JLabel jLabel = new JLabel("Вы уверены, что хотите выйти?");
                JButton jButton1 = new JButton("Да");
                JButton jButton2 = new JButton("Нет");
                JPanel jPanel = new JPanel();
                jDialog.add(jPanel);
                jPanel.add (jLabel);
                jPanel.add (jButton1);
                jPanel.add (jButton2);
                jDialog.setVisible(true);
                jButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(1);
                    }
                 });
            }

            @Override
            public void windowClosed(WindowEvent we) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }


}

