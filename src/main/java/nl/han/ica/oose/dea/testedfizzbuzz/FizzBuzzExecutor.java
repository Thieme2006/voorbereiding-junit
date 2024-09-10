package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {
    public String execute(int item) {
        if (item % 3 == 0 && item % 5 != 0) {
            return "Fizz";
        } else if (item % 5 == 0 && item % 3 != 0) {
            return "Buzz";
        } else if (item % 15 == 0) {
            return "FizzBuzz";
        } else {
            return "niet deelbaar";
        }
    }
}
