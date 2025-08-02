public int[] post4(int[] nums) {
    int i = nums.length - 1;
    while (nums[i] != 4) i--;
    int[] result = new int[nums.length - i - 1];
    for (int j = 0; j < result.length; j++) {
        result[j] = nums[i + 1 + j];
    }
    return result;
}
