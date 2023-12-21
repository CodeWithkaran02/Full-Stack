package pack1;

public class multiplB extends mulpaleA {
		void meth2() {
			System.out.println("method 2 called ");
		}
		multiplB(){
			System.out.println("Defalut B constrator");
		}
		public static void main(String args []) {
//			mulpaleA ma = new mulpaleA();
//			ma.meth1();
			multiplB mb = new multiplB();
			mb.meth2();
			
			
		}
}
