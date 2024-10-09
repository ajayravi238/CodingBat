public boolean twoTwo(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i > 0 && nums[i-1] == 2) {
                    continue;
                }
                else if (i < nums.length-1 && nums[i+1] == 2) {
                    i++;
                }
                else {
                    return false;
                }
            }
        }
        return true;
}
