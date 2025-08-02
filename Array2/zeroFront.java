public class zeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeroIndex = 0;
        for (int num : nums) {
            if (num == 0) {
                result[zeroIndex++] = 0;
            }
        }
        for (int num : nums) {
            if (num != 0) {
                result[zeroIndex++] = num;
            }
        }
        return result;
    }
}