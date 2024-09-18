public String zipZap(String str) {
  String s = "";
  if(str.length() < 3) {
    return str;
  }
  for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
      s += "zp";
      i++;
      i++;
    }
    else {
      s += str.charAt(i);
    }
  }
  return s;
}
