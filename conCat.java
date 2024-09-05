public String conCat(String a, String b) {
  String s = "";
  if(a.length() == 0) {
    s += b;
  }
  else if(b.length() == 0) {
    s += a;
  }
  else if((a.charAt(a.length()-1)) == (b.charAt(0))) {
    s += a + "" + b.substring(1, b.length());
  }
  else {
    s += a + "" + b;
  }
  return s;
}
