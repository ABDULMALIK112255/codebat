public String fizzString(String str) {
    boolean startsF = str.startsWith("f");
  boolean endsB = str.endsWith("b");

  if (startsF && endsB) {
    return "FizzBuzz";
  } else if (startsF) {
    return "Fizz";
  } else if (endsB) {
    return "Buzz";
  } else {
    return str;
  }
}
