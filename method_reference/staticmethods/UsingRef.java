package staticmethods;

//Method reference using STATIC METHODS IN A CLASS
public class UsingRef {
    public static void some_method(){
        System.out.println("some_method is a reference method.");
    }
    public static void main(String[] args) {
        InterFRef interFRef = UsingRef::some_method;
        interFRef.interface_method();
    }
}
