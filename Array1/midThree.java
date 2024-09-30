public int[] midThree(int[] nums) {
  int[] arr = new int[3];
  int mid = nums.length/2;
  arr[0] = nums[mid-1];
  arr[1] = nums[mid];
  arr[2] = nums[mid+1];
  return arr;
}
