interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public void showcalcu();
}
class Cstu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	
	public Cstu(String s1,String s2,int m,int f,int c) {
		id = s1;
		name = s2;
		mid = m;
		finl = f;
		common = c;
	}
	public double calcu() {
		return(mid * 0.3 + finl * 0.3 + common * 0.4);
	}
	public void show() {
		showData();
		showScore();
	}
	public void showData() {
		System.out.println("================");
		System.out.println("�Ǹ� = " + id);
		System.out.println("�m�W = " + name);
		System.out.println("----------------");
	}
	public void showScore() {
		System.out.println("�����Ҧ��Z = " + mid);
		System.out.println("�����Ҧ��Z = " + finl);
		System.out.println("���ɦ��Z = " + common);
		System.out.println("�Ǵ����Z = " + calcu());
		System.out.println("================");
	}
}
public class Class11 {

	public static void main(String[] args) {
		Cstu stu = new Cstu("940001","Fiona",90,92,85);
		stu.show();
	}
}
