interface iAaa{
	public void show();
}

class Cbbb{
	public int num = 10;
	
	public void set(int n) {
		num = n;
	}
}
class C extends Cbbb implements iAaa{
	public void show() {
		System.out.println("num = " + num);
	}
}
public class Class08 {

	public static void main(String[] args) {
		C cc = new C();
		cc.set(5);
		cc.show();
	}
}
