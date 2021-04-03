import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageLoader {

    static Image imgX, imgO;
    
    public imageLoader(){
        try {
            imgX = ImageIO.read(new File("resus/x.png"));
            imgO = ImageIO.read(new File("resus/o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
