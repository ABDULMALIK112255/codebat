
public class string1left2 {
	public String left2(String str) {
		  String first2=str.substring(0,2);
		  String rest=str.substring(2);
		  if(str.length()>2){
		    return rest+first2;
		  }
		  else{
		    return str;
		  }
		}

}
