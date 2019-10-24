/**
 * @program:MyIdeaTest
 * @description:测试多线程CountDownLatch同步器
 * @author:JasonYu
 * @date:2019-08-30 10-34
 **/
import java.awt.*;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
public class TestCountDownLatch {
    private CountDownLatch countDownLatch = new CountDownLatch(4);

    public static void main(String[] args) {
        TestCountDownLatch testCountDownLatch = new TestCountDownLatch();
        testCountDownLatch.begin();
    }
    private class Runner implements Runnable{
        private int result;
        public Runner(int result){
            this.result = result;
        }

        @Override
        public void run()
        {
            try{
                Thread.sleep(result*1000);
                countDownLatch.countDown();
                System.out.println("跑完一个，还剩"+countDownLatch.getCount()+"个");
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    private void begin(){
        System.out.println("赛跑开始");
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 4; i++) {
            int result = random.nextInt(3)+1;
            new Thread(new Runner(result)).start();
        }
        try {
            countDownLatch.await();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("所有人都跑完了，裁判开始计算成绩");
    }
}
