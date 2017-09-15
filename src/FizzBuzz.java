import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    private OutputService outputService = null;
    public static final List<Integer> RANGE = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 );

    public FizzBuzz(OutputService outputService) {
        this.outputService = outputService;
    }

    public void run() {
        this.outputService.println(this.output());
    }

    private String output() {
        return RANGE.stream()
                .map(number -> toFizzBuzz(number))
                .collect(Collectors.joining(", "));
    }

    private String toFizzBuzz(int number) {
        if (isDivisibleByThree(number) && isDivisibleByFive(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (isDivisibleByFive(number)) {
            return "Buzz";
        }
        return String.format("%d", number);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }
}
