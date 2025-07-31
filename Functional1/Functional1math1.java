public List<Integer> math1(List<Integer> nums) {
   List<Integer> result = new ArrayList<>();

  for (int num : nums) {
    result.add((num + 1) * 10);
  }

  return result;
}
