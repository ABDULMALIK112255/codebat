public String wordAppend(String[] strings) {
   Map<String, Integer> countMap = new HashMap<>();
  StringBuilder result = new StringBuilder();

  for (String word : strings) {
    countMap.put(word, countMap.getOrDefault(word, 0) + 1);

    if (countMap.get(word) % 2 == 0) {
      result.append(word);
    }
  }

  return result.toString();
}
