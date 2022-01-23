package Filter;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1", "9", "3","2", "6", "3"};
        Check check = new Check(array);
        check.apply("3");
    }
}
