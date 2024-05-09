import javax.sound.midi.MidiUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jm.JMC;
import jm.gui.cpn.JmMidiPlayer;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;



public class piano  implements ActionListener  {

    private Score score;
    private Note C;
    private Note D;
    private Note E;
    private Note F;
    private Note G;
    private Note A;
    private Note B;
    private Note C_1;
    private Note D_1;
    private Note E_1;
    private Note C_S;
    private Note D_S;
    private Note F_S;
    private Note G_S;
    private Note A_S;
    private Note C_1_S;
    private Note D_1_S;



   private JFrame frame;
   private JPanel panel;
   private JButton c;
    private JButton c_Sharp;
    private JButton d_Sharp;
    private JButton f_Sharp;
    private JButton g_Sharp;
    private JButton a_Sharp;
    private JButton c1_Sharp;
    private JButton d1_Sharp;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton a;
    private JButton b;
    private JButton c1;
    private JButton d1;
    private JButton e1;



    public piano(){
         frame = new JFrame();
        frame.setSize(600,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        ImageIcon icon =new ImageIcon("C:\\Users\\dael1\\IdeaProjects\\actionPreformed\\img\\piano-icon-5.png");

        frame.setIconImage(icon.getImage());

        JLabel label =new JLabel();
        label.setBounds(0,0,600,600);
        label.setIcon(icon);

        JLabel blackKey_label1 =new JLabel();
        blackKey_label1.setBounds(35,10,100,90);
        blackKey_label1.setOpaque(true);

        JLabel blackKey_label2 =new JLabel();
        blackKey_label2.setBounds(185,10,150,90);
        blackKey_label2.setOpaque(true);

        JLabel blackKey_label3 =new JLabel();
        blackKey_label3.setBounds(385,10,100,90);
        blackKey_label3.setOpaque(true);

        JLabel whiteKey_label =new JLabel();
        whiteKey_label.setBounds(0,0,600,250);
        whiteKey_label.setOpaque(true);

        JLayeredPane layeredPane =new JLayeredPane();
        layeredPane.setSize(600,250);
        frame.add(layeredPane);

        c =new JButton();
        c.setBounds(10,10,50,140);
        c_Sharp =new JButton();
        c_Sharp.setBounds(0,0,50,90);
         d =new JButton();
        d.setBounds(60,10,50,140);
        d_Sharp =new JButton();
        d_Sharp.setBounds(50,0,50,90);
         e =new JButton();
        e.setBounds(110,10,50,140);
         f =new JButton();
        f.setBounds(160,10,50,140);
        f_Sharp =new JButton();
        f_Sharp.setBounds(0,0,50,90);
        g =new JButton();
        g.setBounds(210,10,50,140);
        g_Sharp =new JButton();
        g_Sharp.setBounds(50,0,50,90);
       a =new JButton();
        a.setBounds(260,10,50,140);
        a_Sharp =new JButton();
        a_Sharp.setBounds(100,0,50,90);
        b =new JButton();
        b.setBounds(310,10,50,140);
       c1 =new JButton();
        c1.setBounds(360,10,50,140);
        c1_Sharp =new JButton();
        c1_Sharp.setBounds(0,0,50,90);
        d1 =new JButton();
        d1.setBounds(410,10,50,140);
        d1_Sharp =new JButton();
        d1_Sharp.setBounds(50,0,50,90);
        e1 =new JButton();
        e1.setBounds(460,10,50,140);

        c.setText("C");
        d.setText("D");
        e.setText("E");
        f.setText("F");
        g.setText("G");
        a.setText("A");
        b.setText("B");
        c1.setText("C1");
        d1.setText("D1");
        e1.setText("E1");
        c_Sharp.setText("C#");
        d_Sharp.setText("Eb");
        f_Sharp.setText("F#");
        g_Sharp.setText("Ab");
        a_Sharp.setText("Bb");
        c1_Sharp.setText("C1#");
        d1_Sharp.setText("Eb1#");


        c.setFocusable(false);
        d.setFocusable(false);
        e.setFocusable(false);
        f.setFocusable(false);
        g.setFocusable(false);
        a.setFocusable(false);
        b.setFocusable(false);
        c1.setFocusable(false);
        d1.setFocusable(false);
        e1.setFocusable(false);
        c_Sharp.setFocusable(false);
        d_Sharp.setFocusable(false);
        f_Sharp.setFocusable(false);
        g_Sharp.setFocusable(false);
        a_Sharp.setFocusable(false);
        c1_Sharp.setFocusable(false);
        d1_Sharp.setFocusable(false);

        c.setBackground(Color.WHITE);
        d.setBackground(Color.WHITE);
        e.setBackground(Color.WHITE);
        f.setBackground(Color.WHITE);
        g.setBackground(Color.WHITE);
        a.setBackground(Color.WHITE);
        b.setBackground(Color.WHITE);
        c1.setBackground(Color.WHITE);
        d1.setBackground(Color.WHITE);
        e1.setBackground(Color.WHITE);

        c_Sharp.setBackground(Color.BLACK);
        d_Sharp.setBackground(Color.BLACK);
        f_Sharp.setBackground(Color.BLACK);
        g_Sharp.setBackground(Color.BLACK);
        a_Sharp.setBackground(Color.BLACK);
        c1_Sharp.setBackground(Color.BLACK);
        d1_Sharp.setBackground(Color.BLACK);




        blackKey_label1.add(c_Sharp);
        blackKey_label1.add(d_Sharp);
        blackKey_label2.add(f_Sharp);
        blackKey_label2.add(g_Sharp);
        blackKey_label2.add(a_Sharp);
        blackKey_label3.add(c1_Sharp);
        blackKey_label3.add(d1_Sharp);

        whiteKey_label.add(c);
        whiteKey_label.add(d);
        whiteKey_label.add(e);
        whiteKey_label.add(f);
        whiteKey_label.add(g);
        whiteKey_label.add(a);
        whiteKey_label.add(b);
        whiteKey_label.add(c1);
        whiteKey_label.add(d1);
        whiteKey_label.add(e1);


        layeredPane.add(blackKey_label1, Integer.valueOf(1));
        layeredPane.add(blackKey_label2, Integer.valueOf(1));
        layeredPane.add(blackKey_label3, Integer.valueOf(1));
        layeredPane.add(whiteKey_label,Integer.valueOf(0));




        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
        c1.addActionListener(this);
        d1.addActionListener(this);
        e1.addActionListener(this);
        c_Sharp.addActionListener(this);
        d_Sharp.addActionListener(this);
        f_Sharp.addActionListener(this);
        g_Sharp.addActionListener(this);
        a_Sharp.addActionListener(this);
        c1_Sharp.addActionListener(this);
        d1_Sharp.addActionListener(this);






//
//        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent w) {
        if (w.getSource() == c) {
            System.out.print("do, ");
            C = new Note();
            C.setPitch(JMC.C2);
            C.setLength(0.22);
            Play.midi(C);
//           score= new Score();
//           score.setTempo(20);
//           score.addPart(new Part(new Phrase(C)) );
//            Play.midi(score,false);
        }
        if (w.getActionCommand() == d.getActionCommand()) {
            System.out.print("re, ");
            D = new Note();
            D.setPitch(JMC.D2);
            D.setLength(0.22);
            Play.midi(D);
        }
        if (w.getActionCommand() == e.getActionCommand()) {
            System.out.print("me, ");
            E = new Note();
            E.setPitch(JMC.E2);
            E.setLength(0.22);
            Play.midi(E);
        }
        if (w.getActionCommand() == f.getActionCommand()) {
            System.out.print("fa, ");
            F = new Note();
            F.setPitch(JMC.F2);
            F.setLength(0.22);
            Play.midi(F);
        }
        if (w.getActionCommand() == g.getActionCommand()) {
            System.out.print("sol, ");
            G = new Note();
            G.setPitch(JMC.G2);
            G.setLength(0.22);
            Play.midi(G);
        }
        if (w.getActionCommand() == a.getActionCommand()) {
            System.out.print("la, ");
            A = new Note();
            A.setPitch(JMC.A2);
            A.setLength(0.22);
            Play.midi(A);
        }
        if (w.getActionCommand() == b.getActionCommand()) {
            System.out.print("si, ");
            B = new Note();
            B.setPitch(JMC.B2);
            B.setLength(0.22);
            Play.midi(B);
        }
        if (w.getActionCommand() == c1.getActionCommand()) {
            System.out.print("do_1, ");
            C_1 = new Note();
            C_1.setPitch(JMC.C3);
            C_1.setLength(0.22);
            Play.midi(C_1);
        }
        if (w.getActionCommand() == d1.getActionCommand()) {
            System.out.print("re_1, ");
            D_1 = new Note();
            D_1.setPitch(JMC.D3);
            D_1.setLength(0.22);
            Play.midi(D_1);
        }
        if (w.getActionCommand() == e1.getActionCommand()) {
            System.out.print("me_1, ");
            E_1 = new Note();
            E_1.setPitch(JMC.E3);
            E_1.setLength(0.22);
            Play.midi(E_1);
        }
        if (w.getActionCommand() == c_Sharp.getActionCommand()) {
            System.out.print("do#, ");
            C_S = new Note();
            C_S.setPitch(JMC.CS2);
            C_S.setLength(0.22);
            Play.midi(C_S);
        }
        if (w.getActionCommand() == d_Sharp.getActionCommand()) {
            System.out.print("me_b, ");
            D_S = new Note();
            D_S.setPitch(JMC.DS2);
            D_S.setLength(0.22);
            Play.midi(D_S);
        }
        if (w.getActionCommand() == f_Sharp.getActionCommand()) {
            System.out.print("fa#, ");
            F_S = new Note();
            F_S.setPitch(JMC.FS2);
            F_S.setLength(0.22);
            Play.midi(F_S);
        }
        if (w.getActionCommand() == g_Sharp.getActionCommand()) {
            System.out.print("la_b, ");
            G_S = new Note();
            G_S.setPitch(JMC.GS2);
            G_S.setLength(0.22);
            Play.midi(G_S);
        }
        if (w.getActionCommand() == a_Sharp.getActionCommand()) {
            System.out.print("si_b, ");
            A_S = new Note();
            A_S.setPitch(JMC.AS2);
            A_S.setLength(0.22);
            Play.midi(A_S);

        }
        if (w.getActionCommand() == c1_Sharp.getActionCommand()) {
            System.out.print("do_1#, ");
            C_1_S = new Note();
            C_1_S.setPitch(JMC.CS3);
            C_1_S.setLength(0.22);
            Play.midi(C_1_S);
        }
        if (w.getActionCommand() == d1_Sharp.getActionCommand()) {
            System.out.print("me_1_b, ");
            D_1_S = new Note();
            D_1_S.setPitch(JMC.DS3);
            D_1_S.setLength(0.22);
            Play.midi(D_1_S);

        }


    }
}

