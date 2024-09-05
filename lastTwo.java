public String lastTwo(String str) {
  String s = "";
  if(str.length() >= 2) {
    s += str.substring(0, str.length()-2);
    s += str.charAt(str.length()-1);
    s += str.charAt(str.length()-2);
    return s;
  }
  return str;
}
