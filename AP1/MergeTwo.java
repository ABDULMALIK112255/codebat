public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, k = 0;
        while (k < n) {
            if (a[i].equals(b[j])) {
                result[k++] = a[i];
                i++;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        return result;
    }
}