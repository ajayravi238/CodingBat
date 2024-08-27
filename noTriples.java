public boolean noTriples(int[] num) {
  for(int i=0; i<num.length-2; i++) {
    if(num[i] == num[i+1] && num[i+1] == num[i+2]) {
      return false;
    }
  }
  return true;
}
