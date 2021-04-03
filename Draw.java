
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel{

    private static final long serialVersionUID = 1L;
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //draw
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 900, 650);

        g.setColor(Color.BLACK);
        //Vertical
        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);
        //Horizonal
        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        //Draw PLayer
        g.setColor(Color.WHITE);
        if (Gui.player == 0) {
            g.drawString("Player: X", 20, 50);
        } else if(Gui.player == 1) {
            g.drawString("Player: O", 20, 50);
        }

        //Draw winner
        if (Gui.winner == 1){
            g.drawString("Winner is X", 20, 75);
        } else if (Gui.winner == 2){
            g.drawString("Winner is O", 20, 75);
        }

        //Reihe 1
        if (Gui.state[0] == 1) {
            g.drawImage(imageLoader.imgX, 175, 50, 150, 150, null);
        } else if (Gui.state[0] == 2) {
            g.drawImage(imageLoader.imgO, 175, 50, 150, 150, null);
        }

        if (Gui.state[1] == 1) {
            g.drawImage(imageLoader.imgX, 325, 50, 150, 150, null);
        } else if (Gui.state[1] == 2) {
            g.drawImage(imageLoader.imgO, 325, 50, 150, 150, null);
        }

        if (Gui.state[2] == 1) {
            g.drawImage(imageLoader.imgX, 475, 50, 150, 150, null);
        } else if (Gui.state[2] == 2) {
            g.drawImage(imageLoader.imgO, 475, 50, 150, 150, null);
        }

        //Reihe 2
        if (Gui.state[3] == 1) {
            g.drawImage(imageLoader.imgX, 175, 200, 150, 150, null);
        } else if (Gui.state[3] == 2) {
            g.drawImage(imageLoader.imgO, 175, 200, 150, 150, null);
        }

        if (Gui.state[4] == 1) {
            g.drawImage(imageLoader.imgX, 325, 200, 150, 150, null);
        } else if (Gui.state[4] == 2) {
            g.drawImage(imageLoader.imgO, 325, 200, 150, 150, null);
        }

        if (Gui.state[5] == 1) {
            g.drawImage(imageLoader.imgX, 475, 200, 150, 150, null);
        } else if (Gui.state[5] == 2) {
            g.drawImage(imageLoader.imgO, 475, 200, 150, 150, null);
        }
        //Reihe 3

        if (Gui.state[6] == 1) {
            g.drawImage(imageLoader.imgX, 175, 350, 150, 150, null);
        } else if (Gui.state[6] == 2) {
            g.drawImage(imageLoader.imgO, 175, 350, 150, 150, null);
        }

        if (Gui.state[7] == 1) {
            g.drawImage(imageLoader.imgX, 325, 350, 150, 150, null);
        } else if (Gui.state[7] == 2) {
            g.drawImage(imageLoader.imgO, 325, 350, 150, 150, null);
        }

        if (Gui.state[8] == 1) {
            g.drawImage(imageLoader.imgX, 475, 350, 150, 150, null);
        } else if (Gui.state[8] == 2) {
            g.drawImage(imageLoader.imgO, 475, 350, 150, 150, null);
        }

        repaint();
    }
    
}
