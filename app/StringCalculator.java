package app;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        if(numbers.length() == 1){
            sum = Integer.parseInt(numbers);
        }

        return sum;
    }
}