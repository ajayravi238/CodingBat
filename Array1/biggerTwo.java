public int[] biggerTwo(int[] a, int[] b) {
  if(a[0] + a[1] > b[0] + b[1]) {
    return a;
  }
  else if(a[0] + a[1] < b[0] + b[1]) {
    return b;
  }
  else {
    return a;
  }
}
