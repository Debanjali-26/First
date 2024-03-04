//import java.util.ArrayList;
//import java.util.List;
// 
//class Map1 {
//    // Method to return the String at index ind
//    public static String printIndex(ArrayList<String> list, int ind) {
//        if (ind >= 0 && ind < list.size()) {
//            return list.get(ind);
//        } else {
//            return "Index out of bounds";
//        }
//    }
// 
//    // Method to add element n after element m
//    public static ArrayList<String> addAfter(ArrayList<String> a, String m, String n) {
//        int index = a.indexOf(m);
//        if (index != -1) {
//            a.add(index + 1, n);
//        }
//        return a;
//    }
// 
//    // Method to pick a string at index ind and append to the end of the list
//    public static ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind) {
//        if (ind >= 0 && ind < p.size()) {
//            String pickedElement = p.get(ind);
//            p.remove(ind);
//            p.add(pickedElement);
//        }
//        return p;
//    }
//
// 
//    public static void main(String[] args) {
//        // Sample Usage
//        ArrayList<String> shows = new ArrayList<>();
//        shows.add("Breaking Bad");
//        shows.add("Young Sheldon");
//        shows.add("Friends");
//        shows.add("Sherlock");
//        shows.add("Stranger Things");
// 
//        System.out.println("Original List: " + shows);
// 
//        // Example of printIndex method
//        String elementAtIndex = printIndex(shows, 2);
//        System.out.println("Element at index 2: " + elementAtIndex);
// 
//        // Example of addAfter method
//        ArrayList<String> newListAfterAddition = addAfter(shows, "Friends", "Better Call Saul");
//        System.out.println("List after adding 'Better Call Saul' after 'Friends': " + newListAfterAddition);
// 
//        // Example of pickIndexAndAppend method
//        ArrayList<String> newListAfterPickAndAppend = pickIndexAndAppend(shows, 0);
//        System.out.println("List after picking the element at index 0 and appending it to the end: " + newListAfterPickAndAppend);
//    }
//}

//import java.util.*;
//import java.lang.Math;
//public class Map1{
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		int originalnumber, remainder;
//		double result=0;
//		originalnumber = number;
//		while(originalnumber !=0 ) {
//			remainder = originalnumber % 10;
//			result = result + Math.pow(remainder, 3);
//			originalnumber /= 10;
//		}
//		if(result == number) {
//			System.out.println(number+" is an Armstrong no");
//		}
//		else {
//			System.out.println(number+" is not an Armstrong no");
//		}
//	}
//}


class Map1{
	public static void main(String args[]) {
		String str = "madarradam";
		int start = 0;
		int end = str.length()-1;
		while(start<end) {
			if(str.charAt(start)== str.charAt(end)) {
				System.out.println("Palindrom");
				return;
			}	
			start++;
			end--;
		}	
		System.out.println("Not Palindrom");
	}
	
}
