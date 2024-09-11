public boolean xyBalance(String str) {
  int x = 0, y = 0;
  if(str.length() == 1 && str.charAt(0) == 'x') {
    return false;
  }
  for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == 'x') {
      x = i;
    }
    if(str.charAt(i) == 'y') {
      y = i;
    }
  }
  if(x <= y) {
    return true;
  }
  return false;
}
