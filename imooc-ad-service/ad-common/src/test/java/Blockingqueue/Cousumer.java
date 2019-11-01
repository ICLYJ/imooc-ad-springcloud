package Blockingqueue;

import java.util.concurrent.BlockingDeque;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/6/22 22:39
 */
public class Cousumer implements Runnable{

    BlockingDeque<String> queue;

    public Cousumer(BlockingDeque queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = queue.take();//如果队列为空，会阻塞当前线程
            System.out.println(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
