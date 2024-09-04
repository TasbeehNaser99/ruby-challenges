import java.util.ArrayList;
import java.util.Collections;

public class MissingNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 2, 1, 5, 4, 6, 9, 7, 8, 10);

        
        ArrayList<Integer> missingNumbers = findMissingNumbers(numbers);

        System.out.println(missingNumbers);
    }

    public static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> numbers) {
        
        Collections.sort(numbers);

        ArrayList<Integer> missingNumbers = new ArrayList<>();

        int min = numbers.get(0);
        int max = numbers.get(numbers.size() - 1);

        for (int i = min; i <= max; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
