import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class TestRandomCode {
    @Test
    public void testRandomCode() throws IOException {
        Image image=new BufferedImage(100,40,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setFont(new Font("Times New Roman",Font.PLAIN,30));
        graphics.setColor(Color.CYAN);

        graphics.fillRect(0,0,100,40);
        char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        graphics.setColor(Color.GRAY);
        StringBuilder stringBuilder = new StringBuilder();

        Random random=new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chars.length);
            graphics.drawString(String.valueOf(chars[index]),8+24*i,30);
            stringBuilder.append(chars[index]);
        }
        ImageIO.write((RenderedImage) image,"jpg",new File("D://JPG//Random.jpg"));
        System.out.println(stringBuilder);

    }
}
