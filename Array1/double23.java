public boolean double23(int[] nums) {
  for(int i=0; i<nums.length-1; i++) {
    if((nums[i] == 2 && nums[i+1] == 2) || (nums[i] == 3 && nums[i+1] == 3)) {
      return true;
    }
  }
  return false;
}
