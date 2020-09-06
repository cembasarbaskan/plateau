import entity.Position;
import entity.Rover;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class MainTest {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void test00() {
        Rover rover = new Rover(5, 5, new Position(1, 2, 'N'), "LMLMLMLMM".toCharArray());
        Position position = rover.findPosition();
        String result = position.getX() + " " + position.getY() + " " + position.getFacing();
        assert result.equals("1 3 N");
    }

    @Test
    public void test01() {
        Rover rover = new Rover(5, 5, new Position(3, 3, 'E'), "MMRMMRMRRM".toCharArray());
        Position position = rover.findPosition();
        String result = position.getX() + " " + position.getY() + " " + position.getFacing();
        assert result.equals("5 1 E");
    }
}
