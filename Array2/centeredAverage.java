public int centeredAverage(int[] nums) {
    int min = nums[0], max = nums[0], sum = 0;
    for (int num : nums) {
        if (num < min) min = num;
        if (num > max) max = num;
        sum += num;
    }
    return (sum - min - max) / (nums.length - 2);
}
