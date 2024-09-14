public String getSandwich(String str) {
  String s = "";
  int sIndex = str.indexOf("bread");
  int lIndex = str.lastIndexOf("bread");
  if((sIndex == -1 || lIndex == -1) || sIndex == lIndex)  {
    return "";
  }
  else {
    s += str.substring(sIndex+5, lIndex);
  }
  return s;
}
