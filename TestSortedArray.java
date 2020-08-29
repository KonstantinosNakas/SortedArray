
public class TestSortedArray {
	
	public static void main(String[] args){
		SortedArray sa1 = new SortedArray();
		sa1.insert(10);
		sa1.insert(2);
		sa1.insert(12);
		
		System.out.println(sa1);
		
		SortedArray sa2 = new SortedArray();
		sa2.insert(12);
		sa2.insert(10);
		sa2.insert(2);		
		
		System.out.println(sa2);
		
		if (sa1.equals(sa2)){
			System.out.println("The two queues are the same!");
		}else{
			System.out.println("The two queues are NOT the same!");
		}
		 
		sa1.insert(5);
		System.out.println(sa1);
		
		System.out.println("To elaxisto apo thn parapanw lista einai: " + sa1.min());
		System.out.println("To megisto apo thn parapanw lista einai: " + sa1.max());
		
		sa1.delete(5);
		System.out.println(sa1);
		
		sa2.insert(2); sa2.insert(10); sa2.insert(12);
		System.out.println(sa2);
		if (sa1.equals(sa2)){
			System.out.println("The two queues are the same!");
		}else{
			System.out.println("The two queues are NOT the same!");
		}
		
	}
	
}
