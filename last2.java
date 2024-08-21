public int last2(String str) {
  int count = 0;
  if(str.length() > 2) {
    String last2 = str.substring(str.length()-2, str.length());
  
  for(int i=0; i<str.length()-2; i++) {
    String s = str.substring(i, i+2);
    if(s.equals(last2)) {
      count++;
    }
  }
  return count;
  }
  else {
    return 0;
  } 
}
