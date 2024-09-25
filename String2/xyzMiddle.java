public boolean xyzMiddle(String str) {
  int x=0, z=0;
  for(int i=0; i<str.length()-2; i++) {
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z') {
      x = i;
      z = i+2;
      int before = x;
      int after = str.length() - (z+1);
      if(Math.abs(before - after) <= 1) {
       return true;
      }
    }
  }
  return false;
}
