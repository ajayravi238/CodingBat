public boolean catDog(String str) {
  int cCount = 0, dCount = 0;
  for(int i=0; i<str.length()-2; i++) {
    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
      cCount++;
    }
    if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') {
      dCount++;
    }
  }
  if(cCount == dCount) {
    return true;
  }
  return false;
}
