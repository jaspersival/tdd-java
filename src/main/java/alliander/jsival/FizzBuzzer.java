package alliander.jsival;

public class FizzBuzzer {
    int converted_num;

    public String fizzBuzz(Number num) {
        converted_num = num.intValue();

        if (isMultipleOfFive() && isMultipleOfThree()){
            return "FizzBuzz";
        }

        if (num.intValue() % 3 == 0) {
            return "Fizz";
        } else if (num.intValue() % 5 == 0) {
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
