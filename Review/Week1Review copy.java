import java.util.*;

public class Week1Review {
	

	public static void main(String[] args) {
		
		
	//ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("jimmy");
		
		System.out.println("Arraylist");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
		//Iterator
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if(s.equals("hello")){
					it.remove();
					System.out.println("removed hello");
		}

	}
		
	//Stacks
		System.out.println("\nStack\n");
		Stack<String> stack = new Stack<>();
		stack.push("hello");
		stack.push("world");
		stack.push("james");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		//Queue
		
		System.out.println("\nQueue\n"); 
		
		Queue<String> que = new ArrayDeque<>();
		que.add("hello");
		que.add("world");
		que.add("james");
		
		//HashMap
		
		System.out.println("\nHashmap\n");
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Students", 17);
		map.put("Instructors", 1);
		System.out.println("there are "+map.get("Students")+ " student sin the classroom");
		System.out.println("there are "+map.get("Instructors")+ " teachers in the classroom");
		
		//iterate through map
		Set<String> keys = map.keySet();//use keyset to iterate through
		
		for(String key:keys) {
			System.out.println("the key is "+ key+". The value is "+ map.get(key));
			if(key.equals("Students")) {
				map.put(key, map.get(key)+1);
			}
		}
		System.out.println(map);
		
		

}
}
