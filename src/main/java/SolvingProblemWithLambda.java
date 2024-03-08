import java.util.List;

public class SolvingProblemWithLambda {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF","Azure","Docker","Kubernetes");
        //printAllNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
        //printEvenNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
        //printOddNumbers(List.of(1,2,3,4,212,343,53,299,2,3));
        //printAllCourses(courses);
        printSpringCourses(courses);
    }

    private static void printOddNumbers(List<Integer> integers) {
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2==1)
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.startsWith("Spring"))
                .forEach(System.out::println);
    }


}
