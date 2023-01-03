import org.junit.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

import static java.lang.Thread.sleep;

public class TestMailSend {
    @Test
    public void testMail() throws Exception {
        Properties properties=new Properties();
        properties.put("mail.transport.protocol","smtp");
        properties.put("mail.smtp.host","smtp.qq.com");

        Session session= Session.getInstance(properties);

        String content="Test Mail From http://www.shuaihu.vip" +
                "Mail send by zsh1583139786@qq.com";
        MimeMessage message=new MimeMessage(session);
        message.setFrom(new InternetAddress("1583139786@qq.com"));
        InternetAddress [] internetAddress;
        internetAddress = new InternetAddress[3];
        internetAddress[0]=new InternetAddress("shuaihu13637271700@dingtalk.com");
        internetAddress[1]=new InternetAddress("2915574897@qq.com");
        internetAddress[2]=new InternetAddress("shuaihu13637271700@163.com");
        message.setRecipients(MimeMessage.RecipientType.TO,internetAddress);
        message.setSubject("Mail send by http://www.shuaihu.vip");
        message.setSentDate(new Date());
        message.setText(content);
        message.setSubject("welcome to shuaihu.vip website!");

        //annex
        MimeMultipart related=new MimeMultipart("related");
//        message.setContent(related);
        MimeBodyPart contentBody=new MimeBodyPart();
        MimeBodyPart resources=new MimeBodyPart();
        String Path="D://JPG//test.jpg";
        DataSource dataSource=new FileDataSource(new File(Path));
        DataHandler handler=new DataHandler(dataSource);

        resources.setDataHandler(handler);
        resources.setContentID("test.jpg");

        contentBody.setText(content);
        contentBody.setContent("<img src='cid:test.jpg'/>","text/html;charset=UTF-8");
        related.addBodyPart(contentBody);
        related.addBodyPart(resources);

       message.setContent(related);
        message.saveChanges();
        Thread.currentThread().sleep(1000);
        Transport transport = session.getTransport();
        transport.connect("zsh1583139786@qq.com","esjurqdsayzwhjbb");
        transport.sendMessage(message,message.getAllRecipients());



    }
    @Test
    public void testNumber() throws Exception {
            for (int i = 0; i < 8; i++) {
                try {
                    Thread.currentThread().sleep(200);
                    testMail();
                    System.out.printf("--->"+i);
                }catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }





    }
}
