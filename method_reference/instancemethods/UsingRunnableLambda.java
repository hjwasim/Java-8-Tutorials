package instancemethods;

public class UsingRunnableLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 7; i++) {
                System.out.println("THIS IS CHILD THREAD!!");
            }
        };
        Thread child_thread = new Thread(runnable);
        child_thread.start();
        for (int i = 0; i < 7; i++) {
            System.out.println("THIS IS MAIN THREAD!!");
        }
    }

}
