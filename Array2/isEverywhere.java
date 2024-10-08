public boolean isEverywhere(int[] nums, int val) {
  int count = 0;
  if(nums.length == 0) {
    return true;
  }
  for(int i=0; i<nums.length-1; i++) {
    if(nums[i] == val || nums[i+1] == val) {
      count++;
    }
  }
  if(nums.length-1 == count) {
    return true;
  }
  return false;
}
