import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("resources/HorizontalLogoTrans.png"));
       } catch (IOException ex) {
           System.err.println(ex.getMessage());
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 70, 0, 300, 78, this); // see javadoc for more info on the parameters            
    }

}