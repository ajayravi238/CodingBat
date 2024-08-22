public String stringX(String str) {
  String s = "";
  if(str.length() < 2) {
    return str;
  }
  s += str.charAt(0);
  for(int i=1; i<str.length()-1; i++) {
    if(str.charAt(i) != 'x') {
      s += str.charAt(i);
    }
  }
  s+= str.charAt(str.length()-1);
  return s;
}
