
public class string1last2 {
	public String right2(String str) {
		   String last2=str.substring(str.length()-2);
				  String rest=str.substring(0,str.length()-2);
				  if(str.length()>2){
				    return last2+rest;
				  }
				  else{
				    return str;
				  }
		}

}
