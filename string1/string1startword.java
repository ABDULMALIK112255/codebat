public String startWord(String str, String word) {
    if (word.length() > str.length()) {
    return "";
  }

  String strSub = str.substring(1, word.length());
  String wordSub = word.substring(1);

  if (strSub.equals(wordSub)) {
    return str.substring(0, word.length());
  }

  return "";
}
