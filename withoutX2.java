public String withoutX2(String str) {
  String s = "";
  if(str.length() == 0) {
    return str;
  }
  else if((str.length() == 1) && str.charAt(0) == 'x') {
    return s;
  }
  if(str.charAt(0) != 'x') {
    s += str.charAt(0);
  }
  if(str.charAt(1) != 'x') {
    s += str.charAt(1);
  }
  s += str.substring(2, str.length());
  return s;
}
