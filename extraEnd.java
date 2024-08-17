public String extraEnd(String str) {
  String s = "";
  for(int i=0; i<3; i++) {
    s += str.substring(str.length()-2, str.length());
  }
  return s;
}
