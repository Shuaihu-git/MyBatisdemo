import org.junit.Test;

public class TestThread {
    @Test
    public void testThread(){
        new Thread(){
        TestMailSend testMailSend=new TestMailSend();


        }.start();
    }


}
