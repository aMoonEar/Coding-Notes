class Solution {
    // Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int x: nums) {
            set.put(x, set.getOrDefault(x, 0) + 1);
        }
        for (int x: nums) {
            if (set.get(x) == 1) {
                return x;
            }
        }
        return 0;
    }
}
