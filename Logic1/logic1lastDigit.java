public boolean lastDigit(int a, int b, int c) {
  int aDigit = a % 10;
  int bDigit = b % 10;
  int cDigit = c % 10;

  return (aDigit == bDigit) || (aDigit == cDigit) || (bDigit == cDigit);
}
