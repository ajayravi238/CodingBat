public String front22(String str) {
  String s = "";
  if(str.length() > 2) {
    s+= str.substring(0, 2) + str + str.substring(0, 2);
  }
  else {
    for(int i=0; i<3; i++)
      s+=str;
  }
  return s;
}
