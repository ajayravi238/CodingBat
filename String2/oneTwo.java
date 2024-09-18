public String oneTwo(String str) {
  String s = "";
  for(int i=1; i<str.length()-1; i = i+2) {
    char c = str.charAt(i-1);
    s += str.charAt(i);
    s += str.charAt(i+1);
    s += c;
    i++;
  }
  return s;
}
