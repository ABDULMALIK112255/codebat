public String altPairs(String str) {
    String result = "";
  for (int i = 0; i < str.length(); i += 4) {
    int end = Math.min(i + 2, str.length());
    result += str.substring(i, end);
  }
  return result;
}
