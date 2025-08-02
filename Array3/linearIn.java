public boolean linearIn(int[] outer, int[] inner) {
  int j = 0;
  for (int i = 0; i < outer.length && j < inner.length; i++) {
    if (outer[i] == inner[j]) j++;
  }
  return j == inner.length;
}