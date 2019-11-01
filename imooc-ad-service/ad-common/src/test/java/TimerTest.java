import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/6/26 23:18
 */
public class TimerTest {

    public static void main(String[] args) {
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("批量处理");
//            }
//        };
//
//        Timer timer = new Timer();
//        timer.schedule(timerTask,0,1*1000);

        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("批量处理");
            }
        },10,2000, TimeUnit.MILLISECONDS);

    }

}
