class StartsWithImp
{
	 static String a;
	 public static void main(String[] args) 
	 {
	  	a="nikita";
	  	String srch = "niki";
	  	StartsWithImp obj = new StartsWithImp();
	  	System.out.println(obj.startsWith(srch));

	  } 
	  public boolean StartsWithImp(String srch)
	  {
	  	boolean b= true;
	  	for(int i=0;i<srch.length();i++)
	  	{
	  		if((a.CharAt(i))=(srch.charAt(i))
	  		{
	  			b=false;
	  			break;

	  		}
	  	}
	  	return b;
	  }
}