public String startOz(String str) {
  String s = "";
  if((str.length() == 0) || (str.length() <= 1) && (str.charAt(0) == 'o')) {
    return str;
  }
  else if(str.charAt(0) == 'o' && str.charAt(1) == 'z') {
	  s+="oz";
  }
  else if(str.charAt(0) == 'o') {
	  s+='o';
  }
  else if(str.charAt(1) == 'z') {
	  s+='z';
  }
  return s;
}
