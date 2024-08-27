public String altPairs(String str) {
  String s = "";
  for(int i=0; i<str.length(); i=i+4) {
    s += str.charAt(i);
    if(i+1 < str.length()) {
      s += str.charAt(i+1);
    }
  }
  return s;
}
