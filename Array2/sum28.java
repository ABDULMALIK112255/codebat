public boolean sum28(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        if (num == 2) sum += num;
    }
    return sum == 8;
}
