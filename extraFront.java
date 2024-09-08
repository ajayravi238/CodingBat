public String extraFront(String str) {
  String s = "";
  for(int i=0; i<3; i++) {
    if(str.length() >= 3) {
      s += str.substring(0, 2);
    }
    else {
      s += str;
    }
  }
  return s;
}
