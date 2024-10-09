public boolean haveThree(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length-1; i++) {
    if(nums[i] == 3 && nums[i+1] != 3) {
      count++;
    }
    else if(i+1 == nums.length-1 && nums[i+1] == 3) {
      count++;
    }
  }
  if(count == 3){
    
    return true;
  }
  return false;
}
