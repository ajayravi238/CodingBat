public String comboString(String a, String b) {
  String s = "";
  if(a.length() > b.length()) {
    s += b + a + b;
  }
  else {
    s += a + b + a;
  }
  return s;
}
