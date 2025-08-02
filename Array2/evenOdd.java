public class evenOdd {
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                result[evenIndex++] = num;
            }
        }
        return result;
    }
}