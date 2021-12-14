/**
 * @author zhukunshuai
 */
public class PetersonUtils {

    private static volatile int turn;

    private static volatile boolean[] flag = new boolean[2];

    /**
     * Enter the critical section and acquire the lock.
     *
     * @param process the process id 0/1
     */
    public static void enter(int process) {
        System.out.println("Process " + process + " try to enter...");
        if (!validateProcessId(process)) {
            throw new RuntimeException("Process id error");
        }
        flag[process] = true;
        turn = 1 - process;
        while (flag[1-process] && turn == 1-process) {
        }
    }

    /**
     * Get out of the critical zone and release the lock.
     *
     * @param process the process id 0/1
     */
    public static void release(int process) {
        if (!validateProcessId(process)) {
            throw new RuntimeException("Process id error");
        }
        flag[process] = false;
    }

    private static boolean validateProcessId(int process) {
        if (process != 0 && process != 1) {
            System.err.println("process must be set to 0 or 1 ~~");
            return false;
        }
        return true;
    }
}
