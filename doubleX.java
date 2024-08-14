boolean doubleX(String str) {
  int a = str.indexOf('x');
  if(a+1 >= str.length()) {
    return false;
  }
  else {
    if(str.charAt(a+1) == 'x') {
    return true;
  }
  }
  return false;
}
