public String withoutX(String str) {
  String s = "";
  if(str.length() == 0) {
    return str;
  }
  else if(str.length() == 1 && str.charAt(0) == 'x') {
    return s;
  }
  if(str.charAt(0) != 'x') {
    s += str.charAt(0);
  }
  s += str.substring(1, str.length()-1);
  if(str.charAt(str.length()-1) != 'x') {
    s += str.charAt(str.length()-1);
  }
  return s;
}
