package ThinkInJava.cuncurrency.garden;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new Entrance(i));

        TimeUnit.SECONDS.sleep(3);
        Entrance.cancel();
        exec.shutdown();
        if (exec.awaitTermination(250, TimeUnit.MICROSECONDS))
            System.out.println("有一些任务没有被终结！");
        System.out.println("总共：" + Entrance.getTotalCount());
        System.out.println("Sum of Entrances : " + Entrance.sumEntrances());
    }
}
