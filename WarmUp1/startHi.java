public boolean startHi(String str) {
  if(str.length() >= 2) {
    String s = str.substring(0, 2);
  if(s.equals("hi")) {
    return true;
  }
  }
  return false;
}
