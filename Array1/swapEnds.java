public int[] swapEnds(int[] nums) {
  int[] arr = new int[nums.length];
  arr[0] = nums[nums.length-1];
  for(int i=1; i<nums.length-1; i++) {
    arr[i] = nums[i];
  }
  arr[arr.length-1] = nums[0];
  return arr;
}
