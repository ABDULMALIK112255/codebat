public String lastChars(String a, String b) {
  char first = (a.length() > 0) ? a.charAt(0) : '@';
  char last = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
  return "" + first + last;
}
