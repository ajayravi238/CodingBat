public String front3(String str) {
  String s= "";
  if(str.length()>2) {
    for(int i=0; i<3; i++) {
     s+=str.substring(0, 3);
    }
  }
  else {
    for(int i=0; i<3; i++) {
      s+=str;
    }
  }
  return s;
}
