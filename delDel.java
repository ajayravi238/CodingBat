public String delDel(String str) {
  String s = "";
  if(str.length() < 3) {
    return str;
  }
  else if(str.charAt(1)=='d' && str.charAt(2)=='e' && str.charAt(3)=='l') {
    s+=str.charAt(0)+str.substring(4, str.length());
  }
  else {
    return str;
  }
  return s;
}
