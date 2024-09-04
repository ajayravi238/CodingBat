public String nTwice(String str, int n) {
  String s = "";
  s += str.substring(0, n);
  s += str.substring(str.length()-n);
  return s;
}
