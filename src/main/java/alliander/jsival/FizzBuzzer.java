package alliander.jsival;

public class FizzBuzzer {
    public String fizzBuzz(Number num) {
        if (num.intValue() % 3 == 0) {
            return "Fizz";
        }
        return num.toString();
    }

}
