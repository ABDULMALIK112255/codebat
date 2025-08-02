public boolean canBalance(int[] nums) {
  int total = 0;
  for (int num : nums) total += num;
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
    if (sum == total - sum) return true;
  }
  return false;
}