package Blockingqueue;

import java.util.concurrent.BlockingDeque;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/6/22 22:28
 */
public class Producer implements Runnable {

    BlockingDeque<String> queue;

    public Producer(BlockingDeque<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        String temp = "A Product,生产线程：" + Thread.currentThread().getName();
        System.out.println("I have made a product:" + Thread.currentThread().getName());
        try {
            queue.put(temp); //如果队列是满的话，会阻塞当前线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
