package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
    }

    public static String highAndLow(String numbers) {
        String[] splitString = numbers.split(" ");
        int lowest = Integer.parseInt(splitString[0]);
        int highest = Integer.parseInt(splitString[0]);
        for (int i = 1; i < splitString.length; i++) {
            if (lowest > Integer.parseInt(splitString[i])) {
                lowest = Integer.parseInt(splitString[i]);
            }
            if (highest < Integer.parseInt(splitString[i])) {
                highest = Integer.parseInt(splitString[i]);
            }
        }
        return highest + " " + lowest;
    }

    /* or we can make it simple:
    import static java.util.Arrays.stream;

        IntSummaryStatistics statistics = stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return statistics.getMax() + " " + statistics.getMin();
    */
}
