package pack1;

public class multiC  extends multiplB{
	void meth3() {
		System.out.println("Multilevel Inheritace ");
	}
	
	public static void main(String args []) {
		multiC mc = new multiC();
		//mc.meth();
		mc.meth2();
		mc.meth3();
	}
}
