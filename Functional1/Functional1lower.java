public List<String> lower(List<String> strings) {
    List<String> result = new ArrayList<>();

  for (String str : strings) {
    result.add(str.toLowerCase());
  }

  return result;
}
