public boolean has12(int[] nums) {
  int Oindex = -1, Tindex = -1;
  for(int i=0; i<nums.length; i++) {
    if(nums[i] == 1) {
      Oindex = i;
    }
    else if(nums[i] == 2) {
      Tindex = i;
    }
  }
  if(Oindex == -1) {
    return false;
  }
  else if(Oindex < Tindex) {
    return true;
  }
  return false;
}
