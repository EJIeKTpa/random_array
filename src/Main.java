import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(randomArray));

        int evenCount = countEvenNumbers(randomArray);
        System.out.println("Количество четных чисел: " + evenCount);

        int oddCount = countOdd(randomArray);
        System.out.println("Количество нечетных чисел: " + oddCount);

        int primeCount = countPrimeNumbers(randomArray);
        System.out.println("Количество простых чисел: " + primeCount);

        int sum = calculateSum(randomArray);
        System.out.println("Сумма всех чисел: " + sum);

        int difference = calculateDifference(randomArray);
        System.out.println("Разность между суммой чисел с четным и нечетным индексом: " + difference);

        int zeroCount = countZeros(randomArray);
        System.out.println("Количество нулей: " + zeroCount);
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    private static int countEvenNumbers(int[] array) { //четные
        int count = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int countOdd(int[] array) { //нечетные
        int count = 0;

        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    private static int countPrimeNumbers(int[] array) { // простые
        int count = 0;

        for (int number : array) {
            if (isPrime(number)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int calculateSum(int[] array) { // сумма
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum;
    }

    private static int calculateDifference(int[] array) { //разность четного и нечетного
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }

        return sumEven - sumOdd;
    }

    private static int countZeros(int[] array) { //ноли
        int count = 0;

        for (int number : array) {
            if (number == 0) {
                count++;
            }
        }

        return count;
    }
}
