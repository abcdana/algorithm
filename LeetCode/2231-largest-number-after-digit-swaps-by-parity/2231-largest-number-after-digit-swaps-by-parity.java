import java.util.*;

class Solution {
    public int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (char c : digits) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evens.add(digit);
            } else {
                odds.add(digit);
            }
        }

        evens.sort(Collections.reverseOrder());
        odds.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        int evenIndex = 0, oddIndex = 0;

        for (char c : digits) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                sb.append(evens.get(evenIndex++));
            } else {
                sb.append(odds.get(oddIndex++));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}