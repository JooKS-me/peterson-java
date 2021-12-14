/**
 * @author zhukunshuai
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ProcessOne processOne = new ProcessOne();
        ProcessZero processZero = new ProcessZero();

        processOne.start();
        processZero.start();
    }
}
