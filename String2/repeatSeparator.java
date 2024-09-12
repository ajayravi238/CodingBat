public String repeatSeparator(String word, String sep, int count) {
  String s = "";
  int i=0;
  while(count > i) {
    if(i<count-1) {
      s += word + sep;
      i++;
    }
    else {
      s += word;
      i++;
    }
  }
  return s;
}
