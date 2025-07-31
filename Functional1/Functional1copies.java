public List<String> copies3(List<String> strings) {
   List<String> result = new ArrayList<>();

  for (String str : strings) {
    result.add(str + str + str);}

  return result;
}
