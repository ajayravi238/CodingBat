public int[] front11(int[] a, int[] b) {
  int[] arr = new int[2];
  if(a.length >= 1 && b.length >= 1) {
    arr[0] = a[0];
    arr[1] = b[0];
  }
  else if(a.length == 0 && b.length == 0) {
    int[] a1 = new int[0];
    return a1;
  }
  else if(a.length == 0) {
    int[] arr1 = new int[1];
    arr1[0] = b[0];
    return arr1;
  }
  else if(b.length == 0) {
    int[] arr1 = new int[1];
    arr1[0] = a[0];
    return arr1;
  }
  return arr;
}
