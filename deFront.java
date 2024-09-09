public String deFront(String str) {    
  String s = "";
  if(str.charAt(0) == 'a') {
    s += str.charAt(0);
  }
  if(str.charAt(1) == 'b') {
    s += str.charAt(1);
  }
  s += str.substring(2, str.length());
  return s;
}
