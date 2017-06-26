
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
class Student {
	
	public int id;
	public String name;
	public double cgpa;

	
	
	Student(int id, String name, double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		
	}
}
public class A{
	static ArrayList<Student> list;
	private static Scanner sc;
	static int flag1,flag2,flag3;
	public static void main(String[] args)
	{
		
		
		list=new ArrayList<Student>();
	   
		
		sc = new Scanner(System.in);
		System.out.println("Enter the no of students:");
		int n=sc.nextInt();
		if(2<=n&&n<=1000)
		{
		for(int i=0;i<n;i++)
		{
		int id1=sc.nextInt();
		if(0<=id1 && id1<=100000)
			flag1=1;
		
		
		String	name1=sc.next();
		if(5<=name1.length()&&name1.length()<=30)
			flag2=1;
		
		double	cgpa1=sc.nextDouble();
			if(0<=cgpa1&&cgpa1<=4.00)	
				flag3=1;
			if(flag1==1&&flag2==1&&flag3==1)
			{
			list.add(new Student(id1,name1,cgpa1));
			}
		}
		
		}
		else
		{
			System.out.println("Enter value as 2<=N<=1000");
			
		}
		
		Collections.sort(list,new Compare1());
		//Collections.sort(list,(nameComparator()));
		//Collections.sort(list,reverseOrder(cgpaComparator()));
		
		Iterator<Student> itr=list.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.name); 
		
	}
	
}
}