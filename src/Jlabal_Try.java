import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabal_Try {

    private JFrame frame;
    private JLabel label;

    public Jlabal_Try(){

        ImageIcon image = new ImageIcon("C:\\Users\\dael1\\IdeaProjects\\actionPreformed\\img\\img.png");

        label =new JLabel();
        label.setText("this is a monster!!");
        label.setIcon(image);
        label.setBounds(0,0,500,500);

        frame =new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("upload img");
        frame.setLayout(null);
        frame.add(label);

        frame.setVisible(true);

    }

}
