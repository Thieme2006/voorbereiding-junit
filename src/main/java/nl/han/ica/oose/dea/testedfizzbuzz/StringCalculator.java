package nl.han.ica.oose.dea.testedfizzbuzz;

import java.lang.reflect.Array;

public class StringCalculator {
    public int additive;
    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else if (numbers.equals("1")) {
            return 1;
        } else {
            return addNumbers(numbers);
        }
    }

    public int addNumbers(String numbers) {
        numbers = numbers.replace("\n", ",");
        String[] numberArray = numbers.split(",");
        for (String s : numberArray) {
            System.out.println("Added: " + s);
            additive += Integer.parseInt(s);
        }
        return additive;
    }
}
