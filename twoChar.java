public String twoChar(String str, int index) {
  String s = "";
  if(str.length() < index+2 || index < 0) {
    s += str.substring(0, 2);
  }
  else {
    s += str.substring(index, index+2);
  }
  return s;
}
