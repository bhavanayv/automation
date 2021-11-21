package qsp;

public class Debugging {
public static void main(String[] args) {
	int i=10;
	int j=20;
	//int k=i+j;
	//System.out.println(k);
	Debugging.add(i,j);
}
public static void add(int i,int j) {
	int k=i+j;
	System.out.println(k);
}
}
