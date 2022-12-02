package instancemethods;

// Method reference using INSTANCE_METHOD OF A CLASS
public class UsingRunnableRef {
    public void some_function(){
        for (int i = 0; i < 5; i++) {
            System.out.println("THIS IS CHILD THREAD...");
        }
    }
    public static void main(String[] args) {
        UsingRunnableRef runnableRef = new UsingRunnableRef();
        // objectRefName::instanceMethodName
        Runnable runnable = runnableRef::some_function;
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 7; i++) {
            System.out.println("THIS IS MAIN THREAD!!!!");
        }
    }
}
