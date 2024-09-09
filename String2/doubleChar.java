public String doubleChar(String str) {
  String s = "";
  for(int i=0; i<str.length(); i++) {
    s += str.charAt(i);
    s += str.charAt(i);
  }
  return s;
}
