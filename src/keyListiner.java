import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListiner implements KeyListener , ActionListener {

    private JFrame frame;
    private JLabel label;
    private JLabel label1;
    private  JButton button;
    private JPanel panel;


    public keyListiner(){
        frame =new JFrame();
        frame.setSize(400,400);
//        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);


        label = new JLabel();
        label.setText("HOW U DOING ???");
        label.setBounds(10,10,200,50);

        label1 =new JLabel();
        label1.setText("");
        label1.setBounds(10,40,200,50);




        button =new JButton();
        button.setText("press a");
        button.setBounds(25,25,50,50);

//        label.add(button);

        panel =new JPanel();
        panel.setBounds(10,10,100,100);
        panel.setLayout(null);
        panel.add(button);
        frame.add(panel);





        frame.add(label1);
        frame.add(label);


        frame.addKeyListener(this);
        button.addActionListener(this);
        frame.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_A){


        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("you just pressed the button to activate a key!!");
            frame.setFocusable(true);
        }

    }
}
