package reverse;

public class Reverse {
	public static void main (String args[]) {
		String s="saran";
		String res="";
		for(int i=(s.length()-1);i>=0;i--) {
			res=res+s.charAt(i);
			}
		System.out.println(res);
		
		
	}
	


}
