import java.util.List;

public class SolvingProblemWithLambda {
    public static void main(String[] args) {
        //printAllNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
        printEvenNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2==0)
                .forEach(System.out::println);
    }


}
