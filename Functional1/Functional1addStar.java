public List<String> addStar(List<String> strings) {
    List<String> result = new ArrayList<>();

  for (String str : strings) {
    result.add(str + "*"); 
  }

  return result;
}
