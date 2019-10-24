import java.util.concurrent.CyclicBarrier;

/**
 * @program:MyIdeaTest
 * @description:测试CyclicBarrier
 * @author:JasonYu
 * @date:2019-08-30 10-50
 **/
public class TestCyclicBarrier {
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
    public volatile int state = 1;
    public static void main(String[] args) {
        new TestCyclicBarrier().begin();
    }

    public void begin(){
        for (int i = 0; i < 5; i++) {
            new Thread((new Student())).start();
        }
    }
    private class Student implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                cyclicBarrier.await();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
