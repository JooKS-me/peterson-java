/**
 * @author zhukunshuai
 */
public class ProcessOne {

    public void start() {
        new Thread(() -> {
            PetersonUtils.enter(1);
            System.out.println("Process 1 enter! And will sleep 3 seconds~");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            PetersonUtils.release(1);
            System.out.println("Process 1 release!");
        }).start();
    }
}
