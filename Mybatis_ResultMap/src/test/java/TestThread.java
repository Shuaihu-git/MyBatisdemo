import org.junit.Test;

public class TestThread {
    /**
     * 邮件发送线程
     */
    @Test
    public void testThread(){
        new Thread(){
        TestMailSend testMailSend=new TestMailSend();


        }.start();
    }


}
