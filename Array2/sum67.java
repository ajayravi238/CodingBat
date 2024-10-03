public int sum67(int[] nums) {
  int sum = 0;
        boolean inIgnoreSection = false;
        
        for (int num : nums) {
            if (num == 6) {
                inIgnoreSection = true;  // Start ignoring numbers
            }
            if (!inIgnoreSection) {
                sum += num;  // Add to sum if not in ignore section
            }
            if (num == 7) {
                inIgnoreSection = false;  // Stop ignoring after 7
            }
        }
        
        return sum;
}
