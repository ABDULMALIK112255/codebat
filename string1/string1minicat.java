public String minCat(String a, String b) {
    int minLength = Math.min(a.length(), b.length());
  String aTrimmed = a.substring(a.length() - minLength);
  String bTrimmed = b.substring(b.length() - minLength);
  return aTrimmed + bTrimmed;
}
