import java.util.ArrayList;

public class FizzBuzz {
    public String generateTo(int max) {
        ArrayList<String> outFizzBuzz = new ArrayList<>();

        for(int i = 1; i <= max; ++i)
            outFizzBuzz.add(getFizzBuzzForNumber(i));

        return String.join(" ", outFizzBuzz);
    }

    private String getFizzBuzzForNumber(int number) {
        String out = "";

        if(number % 3 == 0)
            out += "Fizz";
        if(number % 5 == 0)
            out += "Buzz";

        return !out.isEmpty() ? out : String.valueOf(number);
    }
}
