public int[] rotateLeft3(int[] nums) {
  int[] arr = new int[3];
  arr[0] = nums[1];
  arr[1] = nums[2];
  arr[2] = nums[0];
  return arr;
}
