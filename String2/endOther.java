public boolean endOther(String a, String b) {
  String s1 = a.toLowerCase();
  String s2 = b.toLowerCase();
  if(s1.length() >= s2.length()) {
    int s2l = s2.length();
    if(s1.substring(s1.length()-s2l).equals(s2)) {
      return true;
    }
  }
  if(s1.length() < s2.length()) {
    int s1l = s1.length();
    if(s2.substring(s2.length()-s1l).equals(s1)) {
      return true;
    }
  }
  return false;
}
