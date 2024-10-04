public boolean only14(int[] nums) {
  int count=0;
  for(int i=0; i<nums.length; i++) {
    if(nums[i] == 1 || nums[i] == 4) {
      count++;
    }
  }
  if(count == nums.length) {
    return true;
  }
  return false;
}
