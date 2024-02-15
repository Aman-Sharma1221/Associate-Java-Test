import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class Solution_1Test {
    @Test
    public void testOutputForGivenInput() {
        String input = "5\n"; // User input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Solution_1.main(new String[]{});
        System.setIn(System.in);
        System.setOut(System.out);
        String expectedOutput = "5 \n55 \n555 \n5555 \n55555 \n555555 \n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
