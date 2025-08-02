public boolean makeBricks(int small, int big, int goal) {
  int maxBig = Math.min(big, goal / 5);
  int remaining = goal - (maxBig * 5);
  return small >= remaining;
}
