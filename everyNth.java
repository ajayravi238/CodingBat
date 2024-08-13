public String everyNth(String str, int n) {
  String s = "";
  for(int i=0; i<str.length(); i++) {
    if(i%n == 0) {
      s += str.charAt(i);
    }
  }
  return s;
}
