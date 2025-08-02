public String sameEnds(String string) {
        int len = string.length();
        for (int i = len / 2; i > 0; i--) {
            if (string.substring(0, i).equals(string.substring(len - i))) {
                return string.substring(0, i);
            }
        }
        return "";
    }