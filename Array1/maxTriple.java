public int maxTriple(int[] arr) {
  int a = arr[0], b = arr[arr.length/2], c = arr[arr.length-1];
  if(a > b && a > c) {
    return a;
  }
  else if(b > a && b > c) {
    return b;
  }
  return c;
}
