public String theEnd(String str, boolean front) {
  String s = "";
  if(front == true) {
    s += str.charAt(0);
  }
  else {
    s += str.charAt(str.length()-1);
  }
  return s;
}
