package alliander.jsival;

public class FizzBuzzer {
    public String fizzBuzz(Number num) {
        if (num.intValue() == 3) {
            return "Fizz";
        }
        return num.toString();
    }

}
