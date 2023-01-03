import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 生成二维码（Generate QRCode）
 * @Author 张帅虎
 * @Data 2022/10/4
 */
public class TestQRCode {
    @Test
    public void testQRcode() throws WriterException, IOException {
        String content="http://www.shuaihu.vip";
        BarcodeFormat type=BarcodeFormat.QR_CODE;
        Map map=new HashMap();
        map.put(EncodeHintType.CHARACTER_SET,"UTF-8");
        map.put(EncodeHintType.MARGIN,2);
        map.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
        //定义二维码大小
        int height=600;
        int width=600;
        //获取画板对象
        MultiFormatWriter multiFormatWriter=new MultiFormatWriter();
        BitMatrix encode = multiFormatWriter.encode(content, type, width, height, map);
        int black= Color.black.getRGB();
        int white=Color.white.getRGB();
        //绘制二维码
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                image.setRGB(i,j,encode.get(i,j)?black:white);
            }

        }
        //将生成的二维码数据导出到指定文件
        File file =new File("D://JPG//test.jpg");
        if (!file.exists()){
            file.mkdirs();
        }
        ImageIO.write(image,"jpg",file);

    }
}
