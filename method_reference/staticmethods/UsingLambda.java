package staticmethods;

public class UsingLambda {
    public static void main(String[] args) {
        InterFRef inf = () -> {
            System.out.println("Interface method implemented!");
            System.out.println("Using Lambda expression.");
        };
        inf.interface_method();
    }
}
