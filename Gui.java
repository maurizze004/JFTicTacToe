import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

    JFrame jf;
    Draw draw;
    JButton reset;

    static JButton btn[] = new JButton[9];
    static int state[] = new int[9];

    static int player = 0;
    static int winner = 0;

    public Gui(){
        jf = new JFrame();
        draw = new Draw();
        reset = new JButton("Reset");

        jf.setSize(900, 650);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("First JF try TicTacToe");
        jf.setBackground(Color.blue);

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new actionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);
        }
        buttonPlacement.place();

        reset.setBounds(675, 500, 100, 40);
        reset.setVisible(true);
        reset.setBackground(Color.WHITE);
        reset.setForeground(Color.black);
        reset.setFocusPainted(false);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Funktion.reset();
            }
        });
        jf.add(reset);

        draw.setBounds(0,0,800,600);
        draw.setVisible(true);
        draw.setBackground(Color.blue);
        jf.add(draw);
        
        jf.setVisible(true);

    }
}
