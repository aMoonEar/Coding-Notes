class PlusOne {
    // Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
    // Input: [1,2,3]
    // Output: [1,2,4]
    public int[] plusOne(int[] digits) {

        // Iterate backwards through array, if 9 and beginning is reached, make new array with length+1 and make array accordingly
        // If 9 is reached, make it 0
        // Stop at first integer that isnt 9, and increase it by 1
        
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] == 9 && i == 0) {
                int[] outputArray = new int[digits.length + 1];
                outputArray[0] = 1;
                for (int j=1; j<digits.length; j++) {
                    outputArray[j] = 0;
                }
                return outputArray;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                System.out.println(digits[i]);
                System.out.println(i);
                digits[i] = digits[i] + 1;
                break;
            }
        }

        return digits;

    }
}
