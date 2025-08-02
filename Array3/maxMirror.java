public int maxMirror(int[] nums) {
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= 0; j--) {
      int length = 0;
      int x = i, y = j;
      while (x < nums.length && y >= 0 && nums[x] == nums[y]) {
        length++;
        x++;
        y--;
      }
      max = Math.max(max, length);
    }
  }
  return max;
}