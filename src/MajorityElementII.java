import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MajorityElementII {


    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])) {
                hashmap.replace(nums[i], hashmap.get(nums[i]) + 1);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        for (int k : hashmap.keySet()) {
            if (hashmap.get(k) > (nums.length / 3)) {
                list.add(k);
            }
        }
        return list;
    }


}
