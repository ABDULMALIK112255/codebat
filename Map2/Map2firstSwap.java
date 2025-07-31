public String[] firstSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<>();
  Set<Character> swapped = new HashSet<>();

  for (int i = 0; i < strings.length; i++) {
    char ch = strings[i].charAt(0);

    if (swapped.contains(ch)) {
      continue;
    }

    if (map.containsKey(ch)) {
      int j = map.get(ch);

      String temp = strings[i];
      strings[i] = strings[j];
      strings[j] = temp;

      swapped.add(ch); 
      map.remove(ch); 
    } else {
      map.put(ch, i); 
    }
  }

  return strings;
}
