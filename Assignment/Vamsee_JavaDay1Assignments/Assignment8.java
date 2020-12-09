package coreJavaDay1;
import java.util.*;
public class Assignment8{
	public static void main(String[] arg) {
		int array[] = {1,2,6,2,4,4,6,7,8};
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<8; j++) {
				if(array[i]==array[j]) {
					if(!ans.contains(array[i]))
						ans.add(array[i]);
				}
			}
		}
		for(int i=0; i<ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
