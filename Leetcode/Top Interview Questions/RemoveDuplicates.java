public class RemoveDuplicates {
   // Remove Duplicates from Sorted Array:
   //
   // Given a sorted array nums,
   // remove the duplicates in-place such
   // that each element appear only once and return the new length.

   public static void main(String[] args) {
      // Test array
      int[] nums = new int[]{0,0,1,1,2};
      removeDuplicates(nums);
   }

   public static int removeDuplicates(int[] nums) {
      if (nums.length == 0) return 0;
      int i = 0;

      // j is second pointer
      for (int j = 1; j < nums.length; j++) {
         if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
         }
      }
      return i + 1;
   }
}
