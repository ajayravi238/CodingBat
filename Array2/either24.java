public boolean either24(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length-1; i++) {
    if((nums[i] == 2 && nums[i+1] == 2) || (nums[i] == 4 && nums[i+1] == 4)) {
      count++;
    }
  }
  if(count == 1) {
    return true;
  }
  return false;
}
