public int[] frontPiece(int[] nums) {
  int[] arr = new int[2];
  if(nums.length < 2) {
    return nums;
  }
  else {
    arr[0] = nums[0];
    arr[1] = nums[1];
  }
  return arr;
}
