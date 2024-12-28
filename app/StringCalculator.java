package app;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;

        // Replace new line characters with commas
        numbers = numbers.replace("\n", ",");

        // Split the input string by commas to Extract individual numbers
        String[] digits = numbers.split(",");

        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }

        return sum;
    }
}