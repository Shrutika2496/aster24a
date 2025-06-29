package String;

public class Reverse_String {

	public static void main(String[] args) {
		String a="shrutika";
		String b="";
		for (int i = a.length()-1; i >= 0; i--) //i=7; 7>=0
		{
			b=b+a.charAt(i); //b=b+a b=
			//i++;
		}
		System.out.println(b);

	}

}
//myText = myText.trim().replaceAll("\\s+"," ");