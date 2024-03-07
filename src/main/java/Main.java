import java.util.List;

public class Main {
    public static void main(String[] args) {
        printAllNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
    }

    private static void printAllNumbers(List<Integer> numbers) {
        for (int number:numbers) {
            System.out.println(number);
        }
    }
}
