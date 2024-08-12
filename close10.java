public int close10(int a, int b) {
  int x = Math.abs(a-10);
  int y = Math.abs(b-10);  
  if(x < y) {
    return a;
  }
  if(x > y) {
    return b;
  }
  return 0;
}
