import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int count=1;
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : nums)
        {
            intList.add(i);
        }
        while (intList.contains(count)){
            count++;
        }
        return count;
    }
}

