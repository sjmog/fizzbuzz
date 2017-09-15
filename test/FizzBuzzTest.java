import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class FizzBuzzTest {

  @Test
    void test_it_outputs_a_list_of_numbers_to_system_output() {
      OutputService outputService = Mockito.mock(OutputService.class);
      FizzBuzz fizzBuzz = new FizzBuzz(outputService);

      fizzBuzz.run();

      Mockito.verify(outputService).println("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz");
  }
}