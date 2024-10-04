public boolean no14(int[] nums) {
  int oCount = 0, fCount = 0;
  for(int i=0; i<nums.length; i++) {
    if(nums[i] == 1) {
      oCount++;
    }
    else if(nums[i] == 4) {
      fCount++;
    }
  }
  if(oCount > 0 && fCount > 0) {
    return false;
  }
  return true;
}
