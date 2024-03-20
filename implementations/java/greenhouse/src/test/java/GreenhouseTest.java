import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreenhouseTest {

    @ParameterizedTest
    @MethodSource("temperatureReadingsProvider")
    public void findLongestRangeLength(int[] temperatureReadings, int expected) {
        var actual = Greenhouse.findLongestRangeLength(temperatureReadings);

        assertEquals(expected, actual);


    }

    static Stream<Object[]> temperatureReadingsProvider() {
        return Stream.of(
                new Object[]{new int[]{21}, 1},
                new Object[]{new int[]{17, 23, 24, 25}, 0},
                new Object[]{new int[]{18, 19, 20, 21, 22}, 5},
                new Object[]{new int[]{20, 19, 23, 18, 20, 21, 22}, 4},
                new Object[]{new int[]{20, 21, 22, 23, 18, 19, 20, 21, 22, 20}, 6},
                new Object[]{new int[]{17, 19, 21, 23, 20, 19, 22, 21, 18, 17, 22, 20, 21}, 5},
                new Object[]{new int[]{16, 18, 20, 21, 21, 20, 19, 18, 23, 24, 22, 20, 19, 18, 17}, 7}
        );
    }
}
