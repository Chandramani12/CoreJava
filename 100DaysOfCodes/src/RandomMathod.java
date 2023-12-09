import java.time.Instant;

//Generating 4-digit random number without using Math.random method
public class RandomMathod {
	
	

    public int generateRandomFourDigitNumber() {
        Instant num = java.time.Clock.systemUTC().instant();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int nanonum = num.getNano();

        int intnum = (nanonum % 1000000) / 100;
        String str = Integer.toString(intnum);

        int lstr = str.length();

        if (lstr == 4) {
            return intnum;
        }

        // In case the generated number is not 4 digits, you may handle this scenario.
        // For now, return -1 indicating an error.
        return -1;
    }
    public static void main(String[] args) {
    	RandomMathod obj = new RandomMathod();
        int randomNumber = obj.generateRandomFourDigitNumber();
        System.out.println("Generated random number: " + randomNumber);
    }
}