package solutions;

import java.util.*;

public class AssignmentTwo {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		AssignmentTwo a  = new AssignmentTwo();
		String quit ="";
		
		do {
			System.out.println("Enter problem Numbers between 1-6: \n1. Q 1\n2. Q 2\n3. Q 3\n4. Q 4\n5. Q 5\n6. Q 6");
			String S = scan.nextLine();
			switch(S) {
			case "1": {
				
				System.out.println("Question 1");
				System.out.println("To exit from the queue, Enter empty string & click enter");
				ArrayList<String> b = new ArrayList<>();
				String St = scan.nextLine();
				while (!St.equals("")) {
					b.add(St);
					St = scan.nextLine();
				}
				a.Sol1(b);
				break;
			}
			case "2": {

				System.out.println("Questin 2");
				System.out.println("To exit from queue, Enter the empty string & click enter");
				ArrayList<String> b1 = new ArrayList<>();
				String St1 = scan.nextLine();
				while (!St1.equals("")) {
					b1.add(St1);
					St1 = scan.nextLine();
				}
				System.out.println(a.Sol2(b1));
				break;
			}
			case "3": {
				System.out.println("Question 3");
				ArrayList<Integer> b2 = new ArrayList<>();
				System.out.println("Enter -ve value to exit from queue");
				int c = scan.nextInt();
				while (c > 0) {
					b2.add(c);
					c = scan.nextInt();
				}
				a.Sol3(b2);
				break;
			}
			case "4": {
				System.out.println("Question 4");
				System.out.println("To exit from queue, Enter the empty string & click enter");
				ArrayList<String> b3 = new ArrayList<>();
				String St2=scan.nextLine();
				while (!St2.equals("")) {
					b3.add(St2);
					St2 = scan.nextLine();
				}
				System.out.println(a.Sol4(b3));
				break;
			}
			
			case "5": {
				System.out.println("Question 5");
				ArrayList<String> b4 = new ArrayList<>();
				System.out.println("To exit from the Queue, Enter the empty string & click enter");
				String St3 = scan.nextLine();
				while (!St3.equals("")) {
					b4.add(St3);
					St3 = scan.nextLine();
				}
				System.out.println(a.Sol5(b4));
				break;
			}
			case "6":{
				System.out.println("Question 6");
				System.out.println("To exit from the queue, Enter the empty string & click enter");
				ArrayList<String> b5 = new ArrayList<>();
				String St4 = scan.nextLine();
				while (!St4.equals("")) {
					b5.add(St4);
					St4 = scan.nextLine();
				}
				System.out.println(a.Sol6(b5));
				break;
			}
			default : {
				System.out.println("Enter Correct Number between 1-6: ");
			}
			
			}
			
			System.out.println("Enter Q or q to exit from program");
			quit=scan.nextLine();
			
			
		}while(!quit.equalsIgnoreCase("q"));	
		
		scan.close();
		
	}
	
	public void Sol1(ArrayList<String> S1) {

		Map<String, Integer> mapObject = new HashMap<>();
		for (int i = 0; i < S1.size(); i++) {
			if (mapObject.containsKey(S1.get(i))) {
				mapObject.computeIfPresent(S1.get(i), (K1, V1) -> V1 = V1 + 1);
			} else {
				mapObject.put(S1.get(i), 1);
			}
		}
		System.out.println(mapObject);

	}
	
	public Map<Character, String> Sol2(ArrayList<String> S1) {
		Map<Character, String> mapObject1 = new HashMap<>();
		
		for (int i = 0; i < S1.size(); i++) {
			String value = S1.get(i);
			if (mapObject1.containsKey(S1.get(i).charAt(0))) {
				mapObject1.computeIfPresent(value.charAt(0), (K1, V1) -> V1 = V1 + value);
			} else {
				mapObject1.put(S1.get(i).charAt(0), S1.get(i));
			}
		}
		return mapObject1;

	}
	
	public Set<Integer> Sol3(ArrayList<Integer> A1) {

		Set<Integer> setObject = new HashSet<>();
		System.out.print("[");
		for (int i = 0; i < A1.size(); i++) {
			int value = A1.get(i);
			if (setObject.contains(value)) {
				while (setObject.contains(value)) {
					value++;
				}
				setObject.add(value);
			} else {
				setObject.add(value);
			}
			System.out.print(value);
			if (i != A1.size() - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");

		return setObject;
	}
	
	public ArrayList<String> Sol4(ArrayList<String> A1) {
		// TODO Auto-generated method stub
		ArrayList<String> A2 = new ArrayList<>();
		for (int i = 0; i < A1.size(); i++) {
			char ch[] = A1.get(i).toCharArray();
			Map<Character, Integer> mapObject = new HashMap<>();

			String st = "";
			for (int l = 0; l < ch.length; l++) {
				if (!mapObject.containsKey(ch[l])) {
					st += ch[l];
					mapObject.put(ch[l], 1);
				}
			}
			A2.add(st);
		}
		return A2;

	}
	
	public Map<String, String> Sol5(ArrayList<String> A) {
		// TODO Auto-generated method stub
		Map<String, String> mapObject2 = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			String s = Character.toString(A.get(i).charAt(0));
			String l = Character.toString(A.get(i).charAt(A.get(i).length() - 1));
			if (mapObject2.containsKey(s)) {
				mapObject2.computeIfPresent(s, (K1, V1) -> V1 = l);
			} else {
				mapObject2.put(s, l);
			}
		}
		return mapObject2;

	}

	public Map<String, Boolean> Sol6(ArrayList<String> S1) {

		Map<String, Boolean> mapObject3 = new HashMap<>();
		for (int i = 0; i < S1.size(); i++) {
			if (mapObject3.containsKey(S1.get(i))) {
				mapObject3.computeIfPresent(S1.get(i), (K1, V1) -> V1 = true);
			} else {
				mapObject3.put(S1.get(i), false);
			}
		}
		return mapObject3;

	}

}
