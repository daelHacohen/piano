import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class logIn implements ActionListener{


        private JMenuItem exit;
        private JFrame frame;
        private JPanel panel;
        private JLabel userlabel;
        private JTextField userName;
        private JPasswordField passwordtext;
        private JLabel success;


        public logIn(){

            JMenuBar menuBar =new JMenuBar();
            JMenu menu =new JMenu("options");
            menuBar.add(menu);
            JMenuItem item1 =new JMenuItem("play");
            menu.add(item1);
            item1 =new JMenuItem("stop");
            menu.add(item1);
            item1 =new JMenuItem("revers");
            menu.add(item1);
//        panel.add(menuBar);//adding menuBar


            panel = new JPanel();

            frame=new JFrame();
            frame.setSize(300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





            frame.add(panel);
            panel.setLayout(null);

            userlabel = new JLabel();
            userlabel.setText("user");
            userlabel.setBounds(10,20,30,30);
            panel.add(userlabel);

            userName = new JTextField();
            userName.setBounds(110,20,100,30);
            panel.add(userName);

            JLabel password =new JLabel();
            password.setText("password");
            password.setBounds(10,70,100,30);
            panel.add(password);

            passwordtext =new JPasswordField();
            passwordtext.setBounds(110,70,100,30);
            panel.add(passwordtext);

            JMenuBar menuBar1 =new JMenuBar();
            JMenu options = new JMenu("options");
            JMenuItem enter = new JMenuItem("reset password");
            exit = new JMenuItem("exit");
            options.add(enter);
            options.addSeparator();
            options.add(exit);
            menuBar1.add(options);

            enter.addActionListener(this);



            frame.setJMenuBar(menuBar1);





            JButton button = new JButton();
            button.setText("login");
            button.setBounds(10,120,100,30);
            button.addActionListener(this);
            button.setForeground(Color.BLACK);
            panel.setBackground(Color.gray);
            panel.add(button);


            success = new JLabel("");
            success.setBounds(10,150,100,30);
            panel.add(success);

            JPanel panel1 = new JPanel();





            frame.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String user = userName.getText();
            String password = passwordtext.getText();

            System.out.println(user+ ", " + password);

            if (user.equals("dael") && password.equals("631")){
                success.setText("login successful!");
                frame.dispose();
            piano piano1 =new piano();
            }
            else {success.setText("logging failed");}
            if (e.getSource() == exit){
                System.exit(0);
                System.out.println("exit");
            }


        }
    }


