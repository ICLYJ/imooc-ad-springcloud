package Blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/6/22 22:46
 */
public class Test {

    public static void main(String[] args) {
        BlockingDeque<String> queue = new LinkedBlockingDeque<>(2);
//        BlockingDeque <String> queue1 = new LinkedBlockingDeque<>();
        //不设置的话，LinkedBlockingQueue默认大小为Interger.MAX_VAUE

//        BlockingDeque<String> queue2 = new ArrayBlockingQueue<String>(2);

        Cousumer cousumer = new Cousumer(queue);
        Producer producer = new Producer(queue);

        for (int i = 0; i < 5; i++){
            new Thread(producer,"Producer" + (i + 1)).start();
            new Thread(cousumer,"cousumer" + (i + 1)).start();
        }

    }

}
