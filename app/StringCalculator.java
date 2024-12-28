package app;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        if(numbers.length() == 1){
            sum = Integer.parseInt(numbers);
        }else{
            String[] digits = numbers.split(",");
            for(String digit : digits){
                sum += Integer.parseInt(digit);
            }
        }

        return sum;
    }
}