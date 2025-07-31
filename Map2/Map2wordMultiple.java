public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Integer> countMap = new HashMap<>();
  Map<String, Boolean> result = new HashMap<>();

  for (String word : strings) {
    countMap.put(word, countMap.getOrDefault(word, 0) + 1);
  }

  for (String word : countMap.keySet()) {
    result.put(word, countMap.get(word) >= 2);
  }

  return result;
}
