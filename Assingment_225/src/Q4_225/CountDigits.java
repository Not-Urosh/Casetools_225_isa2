package Q4_225;

public class CountDigits {
	public static int countDigits(int number) {
		  System.out.println("SYBCA225");
        if (number == 0) {
            return 1; // If the number is 0, it has one digit
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}