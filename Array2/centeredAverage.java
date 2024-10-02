public int centeredAverage(int[] arr) {
  for(int i=0; i<arr.length; i++) {
    for(int j=0; j<arr.length-1; j++) {
      if(arr[j] > arr[j+1]) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  int avg = 0;
  for(int i=1; i<arr.length-1; i++) {
    avg += arr[i];
  }
  return avg/(arr.length-2);
}
