import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class panel implements ActionListener {
   private JFrame frame;
   private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
   private JButton button;
    private JButton button1;
    private JButton button2;
    private int counter =0;

   public panel(){
       frame =new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(400,400);

       JLabel blackKey_label =new JLabel();
       blackKey_label.setBounds(0,0,150,150);
       blackKey_label.setOpaque(true);
       blackKey_label.setBackground(Color.BLUE);

       JLabel whiteKey_label =new JLabel();
       whiteKey_label.setBounds(50,50,150,150);
       whiteKey_label.setOpaque(true);
       whiteKey_label.setBackground(Color.RED);

       JLayeredPane layeredPane =new JLayeredPane();
       layeredPane.setSize(600,250);

       layeredPane.add(blackKey_label);
       layeredPane.add(whiteKey_label);
       frame.add(layeredPane);



       panel2= new JPanel();
       panel2.setBounds(30,0,60,90);
       panel2.setLayout(null);
       frame.add(panel2);

       button2 =new JButton();
       button2.setBackground(Color.BLACK);
       button2.setSize(60,90);
       button2.setText("B");
       button2.setFocusable(false);
       panel2.add(button2);



       panel= new JPanel();
       panel.setBounds(0,0,60,150);
       panel.setLayout(null);
       frame.add(panel);

       panel1= new JPanel();
       panel1.setBounds(60,0,60,150);
       panel1.setLayout(null);
       frame.add(panel1);



       button =new JButton();
       button.setBackground(Color.WHITE);
       button.setSize(60,150);
       button.setText("A");
       button.setFocusable(false);
       panel.add(button);
       button.addActionListener(this);

       button1 =new JButton();
       button1.setBackground(Color.WHITE);
       button1.setSize(60,150);
       button1.setText("B");
       button1.setFocusable(false);
       panel1.add(button1);


//       panel2.add(button2);



       frame.setVisible(true);

   }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button){
            counter++;
            System.out.println(counter);
        }
    }
}
