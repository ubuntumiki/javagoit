package core.com.test;

public class ImmutableTest {
    public static void main(String[] args) {
        String numbers = "";
        for(int i = 1; i < 1000; i++) {
            numbers += i;
            System.out.println(numbers);
        }
    }
}
