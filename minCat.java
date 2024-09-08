public String minCat(String a, String b) {
  String str = "";
  if(a.length() > b.length()) {
    int n = b.length();
    str += a.substring(a.length()-n) + b;
  }
  else {
    int n = a.length();
    str += a + b.substring(b.length()-n);
  }
  return str;
}
