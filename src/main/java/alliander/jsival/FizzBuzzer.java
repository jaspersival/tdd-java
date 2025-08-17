package alliander.jsival;

public class FizzBuzzer {
    public String fizzBuzz(Number num) {
        if (num.intValue() % 3 == 0) {
            return "Fizz";
        } else if (num.intValue() % 5 == 0) {
            return "Buzz";
        }
        return num.toString();
    }

}
