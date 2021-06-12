package Lab2;
class Cs {
	int p, q;
	public Cs() {	}
	public Cs (int x, int y) {
		p = x;
		q = y;
	}
	public int add(int i, int j) {
		return(i + j);
	}
	public int add (int i, int j, int k) {
		return (i + j + k);
	}
	public float add (float f1, float f2) {
		return (f1 + f2);
	}
	public void printData() {
		System.out.println("P = "+p);
		System.out.println("Q = "+q);
	}
}
public class ConstructorOverloading {
public static void main(String[] args) {
int x = 1, y = 2, z = 3;
Cs c = new Cs();
Cs c1 = new Cs(x, z);
c1.printData();

float m = 2.3f, n = 3.4f;
int a = c.add(x, y);
int b = c.add(x,  y, z);
float d = c.add(m, n);
System.out.println("A = "+a);
System.out.println("B = "+b);
System.out.println("D = "+d);
}
}