public class warmup1front22 {
    public String front22(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 2);
        }
        else {
            front = str;
        }
        return front  + str+ front;

    }
}
