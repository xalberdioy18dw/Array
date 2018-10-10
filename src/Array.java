
public class Array {

	public static void main(String[] args) {
		String str = new String ("Example of the array.");
		char[] array= str.toCharArray();
		System.out.println("Content of the array: ");
		for(char c: array){
	           System.out.print(c);
	           String[] str2 = str.split("Example");
	           System.out.println( str);
		}
		// TODO Auto-generated method stub

	}

}
