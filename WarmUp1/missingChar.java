public String missingChar(String str, int n) {
  String str1 = str.substring(0, n) + str.substring(n+1, str.length());
  return str1;
} 
