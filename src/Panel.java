import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Panel extends JComponent {
    static void getJFrame2(){
        JFrame jframe = new JFrame();
        jframe.setTitle("Панель с кнопками");
        jframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        jframe.setLocation(100,100);
        JPanel jPanel = new JPanel();
        jframe.add (jPanel);
        JButton jButton = new JButton("Кнопка");
        jPanel.add (jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.orange);
                jButton.setBackground(Color.RED);
            }
        });

    }
}

