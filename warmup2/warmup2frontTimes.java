public String frontTimes(String str, int n) {
    String front = str.length() >= 3 ? str.substring(0, 3) : str;
  String result = "";
  for (int i = 0; i < n; i++) {
    result += front;
  }
  return result;
}
