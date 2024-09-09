public String startWord(String str, String word) {
  String s = "";
  if(str.length() < word.length()) {
    return "";
  }
  s = word.substring(1, word.length());
  int a = word.length();
  String s1 = "";
  s1 += str.substring(1, a);
  if(s.equals(s1)) {
    return str.substring(0, a);
  }
  return "";
}
