public boolean stringE(String str) {
  if(str.length() < 1) {
    return false;
  }
  int count = 0;
  for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == 'e')
    count++;
  }
  if(count>=1 && count<=3) {
    return true;
  }
  return false;
}
