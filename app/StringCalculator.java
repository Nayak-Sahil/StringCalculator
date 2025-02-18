package app;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        
        String delimiter = ",";

        // Check if the input string starts with "//"
        if (numbers.startsWith("//")) {
            // Extract the delimiter
            delimiter = numbers.substring(2, 3);

            // reset the input string to exclude the (delimiter + "\n")
            numbers = numbers.substring(4);
        }

        // Replace new line characters with specified delimiter
        numbers = numbers.replace("\n", delimiter);

        // Replace the delimiter with a comma because if we split by comma in next step then only, we can extract the numbers otherwise delimiter is also included in array.
        numbers = numbers.replace(delimiter, ",");

        // Split the input string by commas to Extract individual numbers
        String[] digits = numbers.split(",");

        boolean isContainsNegative = false;
        String negativeNumbers = "";
        
        for (String digit : digits) {
            if(digit.startsWith("-")){
                if(isContainsNegative) negativeNumbers += ",";
                negativeNumbers += digit;
                isContainsNegative = true;
            }

            if(Integer.parseInt(digit) > 1000){
                continue;
            }

            sum += Integer.parseInt(digit);
        }

        if(isContainsNegative){
            throw new IllegalArgumentException("Negatives numbers not allowed: " + negativeNumbers);
        }
        return sum;
    }
}