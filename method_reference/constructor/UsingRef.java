package constructor;

public class UsingRef {
    public static void main(String[] args) {
        InterF ref = Sample::new;
        Sample s = ref.get();
        System.out.println(s);
    }
}
