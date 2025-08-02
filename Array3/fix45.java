public int[] fix45(int[] nums) {
  int pos = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4 && nums[i + 1] != 5) {
      while (nums[pos] != 5 || (pos > 0 && nums[pos - 1] == 4)) pos++;
      int temp = nums[i + 1];
      nums[i + 1] = nums[pos];
      nums[pos] = temp;
    }
  }
  return nums;
}