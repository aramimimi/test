package inhuritance;

abstract class AA {
	public abstract int b();
	
	public void d() {
		System.out.println("world");
	}
}
	
class B extends AA{
	public int b() {
		return 1;
	}
	
	
}
//---------------------------
public class TestMain {

	public static void main(String[] args) {

		AA bb = new BB();
		bb.disp(); //BB : 13   //오버라이드가 되면 무조건 자식거를 먼저 처리
		System.out.println("bb :" + bb.a);  //bb : 3 . int a 는 오버라이드개념이 없음// 메소드에만 적용됨
		System.out.println();

		BB dd = (BB)bb;  //자식 =(자식)부모 캐스팅
		dd.disp(); // BB : 18
		System.out.println("dd :" + dd.a); //18
		System.out.println();
 
		
		


	}

}
