
public class Solution {

    public static int[] reverseArray(int[] numbers) {

        // Create Arraystack
        arrayStack<Integer> stack = new arrayStack<>(2);

        // Push all numbers into stack
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Create reversed array
        int[] reversed = new int[numbers.length];

        // Pop elements into reversed array
        int i = 0;

        while (!stack.isEmpty()) {
            reversed[i] = stack.pop();
            i++;
        }

        return reversed;
    }
}