public String notReplace(String str) {
    String result = "";
    for (int i = 0; i < str.length(); ) {
        if (i + 1 < str.length() && str.substring(i, i + 2).equals("is") &&
            (i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
            (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
            result += "is not";
            i += 2;
        } else {
            result += str.charAt(i);
            i++;
        }
    }
    return result;
}
