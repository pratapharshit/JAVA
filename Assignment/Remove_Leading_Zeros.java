
public class Remove_Leading_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00002347";
		String S= "";
		for (int i =0;i<str.length();i++ ) {
			if (str.charAt(i)=='0') {
				continue;
				
			}else {
				S= str.substring(i);
				break;
			}
		}
		System.out.println(S);

	}

}
