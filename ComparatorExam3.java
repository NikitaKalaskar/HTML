import java.util.*;
class ComparatorExam3
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=15;i++)
		{
			list.add((int)(Math.random()*10));

		}	
		System.out.println(list);
		list.sort(list,(i1,i2)->i1-i2);
		Collections.sort(list,(i1,i2)->i2-i1);
		System.out.println(list);
	}
}