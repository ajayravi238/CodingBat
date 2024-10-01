public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  if(a.length >= 2) {
    arr[0] = a[0];
    arr[1] = a[1];
  }
  else if(a.length == 1) {
    arr[0] = a[0];
    arr[1] = b[0];
  }
  else {
    arr[0] = b[0];
    arr[1] = b[1];
  }
  return arr;
}
