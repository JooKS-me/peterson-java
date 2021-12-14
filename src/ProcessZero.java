/**
 * @author zhukunshuai
 */
public class ProcessZero {

    public void start() {
        new Thread(() -> {
            PetersonUtils.enter(0);
            System.out.println("Process 0 enter! And will sleep 3 seconds~");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            PetersonUtils.release(0);
            System.out.println("Process 0 release!");
        }).start();
    }
}
