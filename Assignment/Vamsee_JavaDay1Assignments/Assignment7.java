package coreJavaDay1;

public class Assignment7 {
	public static void main(String[] arg) {
		String st = "Hello there, General Kenobi";
		char[] array = st.toCharArray();
		StringBuilder build = new StringBuilder();
		for(int i=0; i<array.length; i++) {
			if(array[i] == 'a' || array[i] =='e' || array[i]=='i' || array[i]=='o' || array[i]=='u') {
				build.append("$");
			}
			else {
				build.append(Character.toString(array[i]));
			}
		}
		System.out.println(build.toString());
	}
}
