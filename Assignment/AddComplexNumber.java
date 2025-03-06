import java.util.Scanner;
class complex{
	int real;
	int img;
	public complex() {}
	public complex(int r,int i) {
		real = r;
		img = i;
	}
	public void show() {
		System.out.println("The number are :"+real+ "+" +img+ "i");
	}
	public void Sum(complex o1, complex o2) {
		real = o1.real + o2.real;
		img = o1.img + o2.img;
		
	}
}
public class AddComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1= new complex(73,95);
		c1.show ();
		complex c2 = new complex(44,25);
		complex c3 = new complex();
		c3.Sum(c1,c2);
		c3.show();

	}

}
