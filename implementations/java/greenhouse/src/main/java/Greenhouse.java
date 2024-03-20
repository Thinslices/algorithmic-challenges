public class Greenhouse {

    public static int findLongestRangeLength(int[] temperatureReadings) {
        var i = 0;
        var longestRange = 0;

        for (int j = 0; j < temperatureReadings.length; j++) {
            var reading = temperatureReadings[j];

            if( reading < 18 || reading > 22) {
                i = j + 1;
            }

            longestRange = Math.max(longestRange, j - i + 1);
        }

        return longestRange;
    }
}