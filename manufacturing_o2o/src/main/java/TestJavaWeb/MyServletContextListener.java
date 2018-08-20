package TestJavaWeb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("开始啊哈哈哈哈");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = null;
        Date currentTime = null;
        try {
            parse = format.parse("2018-6-29 7:00:00");
            currentTime = format.parse("2018-6-29 19:33:00");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("runnnnn  开始计息哈哈哈");
            }
        },currentTime,24*60*60*1000);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("结束哈哈哈");
    }
}
