package qsp;

public class B {
public static void main(String[] args) {
	A a1=new A();
	int x=a1.getValue();		//utilisation
	System.out.println(x);
	a1.setValue(20);			//utilisation
	System.out.println(a1.getValue());
}
}
