import static org.junit.Assert.*;
import org.junit.*;

public class skilldemonstrationTest {
    @Test
    public void subtraction(){
        //this is expceted to throw an error! 10-1=9, not 2
        assertEquals(9, skilldemonstration.subtraction(10, 1));
    }
}
