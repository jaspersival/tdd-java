package alliander.jsival;

public class FizzBuzzer {
    int converted_num;

    public String fizzBuzz(Number num) {
        converted_num = num.intValue();

        if (isMultipleOfFive() && isMultipleOfThree()){
            return "FizzBuzz";
        } else if (isMultipleOfThree()) {
            return "Fizz";
        } else if (isMultipleOfFive()) {
            return "Buzz";
        }
        return num.toString();
    }

    private boolean isMultipleOfFive() {
        return converted_num % 5 == 0;
    }
    private boolean isMultipleOfThree() {
        return converted_num % 3 == 0;
    }
}
