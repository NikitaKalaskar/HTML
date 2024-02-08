import java.util.*;
class VectorExample
{
	public static void main(String[] args) {
		Vector <Integer> a = new Vector<>();
		for(int i=1;i<=100;i+=10)
        a.add(i);

     System.out.println(a);
     System.out.println(a.capacity());
     
	}
}