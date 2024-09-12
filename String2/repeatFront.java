public String repeatFront(String str, int n) {
  String s = "";
  
  for(int i=n; i>0; i--) {
    s += str.substring(0, i);
  }
  return s;
}
