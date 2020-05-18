class Solution {
    // Given two arrays, write a function to compute their intersection.
    // Input: nums1 = [1,2,2,1], nums2 = [2,2]
    // Output: [2,2]
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create a list to contain all numbers that intersect
        List<Integer> list = new ArrayList<>();

        // Create a hashmap to hold all numbers from first array and how many times they're present
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int x: nums1) {
            set.put(x, set.getOrDefault(x,0) + 1);
        }

        // Iterate through second array, if present in HashMap and times present is still greater than 0,
        // Add to list
        for (int x: nums2) {
            if (set.containsKey(x) && set.get(x) > 0) {
                list.add(x);
                set.replace(x, set.get(x)-1);
            }
        }

        // Convert list to array
        int[] output = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }
}
