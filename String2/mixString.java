public String mixString(String a, String b) {
  String s = "";
  if(a.length() < b.length()) {
    for(int i=0; i<a.length(); i++) {
      s += a.charAt(i) + "" + b.charAt(i);
    }
    s += b.substring(a.length());
  }
  else {
    for(int i=0; i<b.length(); i++) {
      s += a.charAt(i) + "" + b.charAt(i);
    }
    s += a.substring(b.length());
  }
  return s;
}
