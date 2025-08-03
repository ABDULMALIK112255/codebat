public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            int cmp = a[i].compareTo(b[j]);
            if (cmp == 0) {
                count++;
                String val = a[i];
                while (i < a.length && a[i].equals(val)) i++;
                while (j < b.length && b[j].equals(val)) j++;
            } else if (cmp < 0) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}