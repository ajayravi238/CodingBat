public int[] maxEnd3(int[] nums) {
  int max = 0;
  if(nums[0] > nums[2]) {
    max = nums[0];
  }
  else {
    max = nums[2];
  }
  int[] arr = new int[3];
  for(int i=0; i<3; i++) {
    arr[i] = max;
  }
  return arr;
}
