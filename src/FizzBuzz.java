public class FizzBuzz {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                output.append("Fizz");
            if (i % 5 == 0)
                output.append("Buzz");

            if (output.length() == 0)
                System.out.println(i);
            else
                System.out.println(output);

            output.setLength(0); //clears the string
        }
    }
}