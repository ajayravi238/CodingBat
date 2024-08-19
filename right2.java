public String right2(String str) {
  String s = "";
  if(str.length() < 2) {
    return str;
  }
  else {
    s += str.substring(str.length()-2) + str.substring(0, str.length()-2);
    return s;
  }
}
