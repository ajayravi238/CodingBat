public String withouEnd2(String str) {
  String s = "";
  if(str.length() < 2) {
    return s;
  }
  else {
    s += str.substring(1, str.length()-1);
    return s; 
  }
}
