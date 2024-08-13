public String endUp(String str) {
  String s = "";
  if(str.length() >= 3) {
    s += str.substring(0, str.length()-3);
    s += str.substring(str.length()-3, str.length()).toUpperCase();
    return s;
  }
  else {
    return str.toUpperCase();
  }
}
