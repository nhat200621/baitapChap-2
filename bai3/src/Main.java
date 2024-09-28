import java.util.Random;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("Random int: " + randomInt);
        int randomBoundInt = random.nextInt(50);
        System.out.println("Random int (0 to 49): " + randomBoundInt);
        double randomDouble = random.nextDouble();
        System.out.println("Random double (0.0 to 1.0): " + randomDouble);
        float randomFloat = random.nextFloat();
        System.out.println("Random float (0.0 to 1.0): " + randomFloat);
        long randomLong = random.nextLong();
        System.out.println("Random long: " + randomLong);
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
        byte[] randomBytes = new byte[5];
        random.nextBytes(randomBytes);
        System.out.print("Random bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        double randomGaussian = random.nextGaussian();
        System.out.println("Random Gaussian: " + randomGaussian);
        random.setSeed(12345L);
        System.out.println("Random int after setting seed: " + random.nextInt());
        IntStream randomInts = random.ints(5, 1, 100);
        System.out.print("Stream of random ints (1 to 99): ");
        randomInts.forEach(i -> System.out.print(i + " "));
    }
}