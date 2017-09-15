import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputServiceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void it_wraps_the_system_output() {
        System.setOut(new PrintStream(outContent));

        OutputService outputService = new OutputService();
        outputService.println("Test line");

        assertEquals("Test line", outContent.toString());

        System.setOut(null);
    }
}