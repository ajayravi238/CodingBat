public String middleTwo(String str) {
  String s = "";
  s += str.charAt((str.length()-1)/2);
  s += str.charAt(((str.length()-1)/2) + 1);
  return s;
}
