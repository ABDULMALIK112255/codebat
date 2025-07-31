public List<String> moreY(List<String> strings) {
   List<String> result = new ArrayList<>();

  for (String str : strings) {
    result.add("y" + str + "y"); 
  }

  return result;
}
