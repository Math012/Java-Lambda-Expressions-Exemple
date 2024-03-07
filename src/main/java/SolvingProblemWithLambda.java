import java.util.List;

public class SolvingProblemWithLambda {
    public static void main(String[] args) {
        printAllNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream().forEach(SolvingProblemWithLambda::print);
    }

    // Creating a method to print each element in our list
    private static void print(int number){
        System.out.println(number);
    }
}
