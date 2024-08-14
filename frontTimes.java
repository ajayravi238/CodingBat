public String frontTimes(String str, int n) {
  String s = "";
  if(str.length() >= 3) {
    for(int i=0; i<n; i++) {
    s += str.substring(0, 3);
    }
  }
  else {
    for(int i=0; i<n; i++) {
      s += str;
    }
  } 
  return s;
}
