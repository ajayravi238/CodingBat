public String makeOutWord(String out, String word) {
  String s = "";
  s += out.substring(0, 2) + word + out.substring(2, 4);
  return s;
}
