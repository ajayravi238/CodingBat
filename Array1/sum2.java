public int sum2(int[] nums) {
  int sum = 0;
  if(nums.length > 1) {
    sum = nums[0] + nums[1];
  }
  else if(nums.length == 1) {
    sum = nums[0];
  }
  else {
    sum = 0;
  }
  return sum;
}
