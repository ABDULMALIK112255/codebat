public List<Integer> rightDigit(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();

  for (int num : nums) {
    result.add(num % 10);
  }

  return result;
}
