import java.util.Comparator;



 class Compare1 implements Comparator<Student>{  
	//static int i;
	//static int Compare(Student o1,Student o2)
	//{
		/*Student s1=(Student)o1;  
		Student s2=(Student)o2;
		if(s1.id==s2.id)  
			return 0;  
			else if(s1.id>s2.id)  
			return 1;  
			else  
			return -1;  
			
			  
		i= s1.name.compareTo(s2.name);  
		
			
			  
		if(s1.cgpa==s2.cgpa)  
			return 0;  
			else if(s1.cgpa>s2.cgpa)  
			return 1;  
			else  
			return -1;  
			
			  
	

	
	}*/

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.cgpa==o2.cgpa)
		{
			 int i =o1.name.compareTo(o2.name); 
			 
			if(i==0)
			{ 
				if(o1.id==o2.id)
				{
					return 0;
				}
				
				else if(o1.id>o2.id)
				{
					return 1;
				}
				
				    else
					return -1;
				
			}
			else if(i>0)
			{
				return 1;
			} 
			else
				return  -1;
			
		}   
		  else if(o1.cgpa>o2.cgpa)	
			return -1;
		    
		  else  
			return 1;
		
	}
}
  
 

 
  
