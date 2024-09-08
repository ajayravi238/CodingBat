public String without2(String str) {
  String s = "";
  if(str.length() < 2) {
    return str;
  }
  else if(str.substring(0, 2).equals(str.substring(str.length()-2))) {
      s += str.substring(2, str.length());
  }
  else {
    s += str.substring(0, str.length());
  }
  return s;
}
