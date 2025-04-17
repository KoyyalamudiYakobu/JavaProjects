package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main 
{

	
	public static void main(String[] args)
	{
	
		Emp e1 = new Emp(2, "Amit", "amit@gmail.com", "amit@123", 6000, 1);
		Emp e2 = new Emp(3, "Sita", "sita@gmail.com", "sita@123", 5500, 8);
		Emp e3 = new Emp(4, "John", "john@gmail.com", "john@123", 7000, 3);
		Emp e4 = new Emp(5, "Priya", "priya@gmail.com", "priya@123", 6500, 6);
		Emp e5 = new Emp(6, "Ravi", "ravi@gmail.com", "ravi@123", 7200, 4);
		Emp e6 = new Emp(7, "Neha", "neha@gmail.com", "neha@123", 4800, 12);
		Emp e7 = new Emp(8, "Karan", "karan@gmail.com", "karan@123", 7500, 2);
		Emp e8 = new Emp(9, "Maya", "maya@gmail.com", "maya@123", 8000, 1);
		Emp e9 = new Emp(10, "Vikram", "vikram@gmail.com", "vikram@123", 5400, 7);
		Emp e10 = new Emp(11, "Simran", "simran@gmail.com", "simran@123", 6200, 9);
		Emp e11 = new Emp(12, "Arjun", "arjun@gmail.com", "arjun@123", 6700, 4);
		Emp e12 = new Emp(13, "Tina", "tina@gmail.com", "tina@123", 7100, 3);
		Emp e13 = new Emp(14, "Asha", "asha@gmail.com", "asha@123", 5300, 11);
		Emp e14 = new Emp(15, "Raj", "raj@gmail.com", "raj@123", 6400, 6);
		Emp e15 = new Emp(16, "Lina", "lina@gmail.com", "lina@123", 5900, 10);

		
		
		List<Emp> list=new ArrayList<Emp>();
		
		list.add(e15);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		list.add(e11);
		list.add(e12);
		list.add(e13);
		list.add(e14);
		
		
		
		
	//String result=list.stream().map(Emp::getName).collect(Collectors.joining(",","{","}"));  // joining() 
		
		//Long list1=list.stream().collect(Collectors.counting());  // counting() for counting 
		
		//Map<Integer, List<Emp>> list1=list.stream().collect(Collectors.groupingBy(Emp::getDeptNo));   // grouping()
		//System.out.println(list1);
		
		
		
		 // List<Emp> list1=list.stream().skip(2).collect(Collectors.toList()); //skip() for skipping 
		
		
		
		//Map<String, Object> list1=list.stream().collect(Collectors.toMap(Emp::getName, emp->emp));  //  toMap()  map to  respective values  . and keys are unique
		
		
		//Map<Boolean, List<Emp>> list1=list.stream().collect(Collectors.partitioningBy(emp->emp.getSalary() > 5000));    // partitioningBY() method use to devide to two parts like false part and true part
		
		/*
		 * Long list1=list.stream().collect(Collectors.summingLong(Emp::getSalary)); //
		 * summing of all salaries
		 * 
		 * System.out.println(list1);
		 * 
		 * Double list2=list.stream().collect(Collectors.averagingLong(Emp::getSalary));
		 * // finding average of respective salary
		 * 
		 * System.out.println(list2);
		 */
		
		Optional<Long> list2=list.stream().map(Emp::getSalary).collect(Collectors.reducing(Long::sum));
	
		System.out.println(list2);
		
		/* @SuppressWarnings("unchecked")
		ListIterator<Emp> e=((List<Emp>) list1).listIterator(); 
		 
		 while(e.hasNext()) 
		 {
			 
		  System.out.println(e.next()); 
		 }
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static BiConsumer collect(Collector<Object, ?, List<Object>> list) {
		// TODO Auto-generated method stub
		return null;
	}
}
