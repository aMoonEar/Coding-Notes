class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) {
            return;
        }
        if (nums.length == 1) {
            return;
        }
        int placeholder = 0;
        int swap;
        for (int i=0; i<k; i++) {

            for (int j=0; j<nums.length; j++) {
                if (j == nums.length-1) {
                    nums[0] = placeholder;
                } else if (j == 0) {
                    placeholder = nums[j+1];
                    nums[j+1] = nums[j];
                } else {
                    swap = nums[j+1];
                    nums[j+1] = placeholder;
                    placeholder = swap;
                }
            }

        }
        return;
    }
}
