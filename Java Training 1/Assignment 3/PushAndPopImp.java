package Assignment3;
import java.util.Stack;
interface stack{
	static Stack<Integer> st= new Stack<Integer>();
}
class  PushOperation extends Thread implements stack{
	public void run() {
		try {
			for(int i=1;i<10;i++) {
				Thread.sleep(2000);
				System.out.println("Inserted"+st.push(i)+"and stack:"+st);
			}
		}catch (Exception e) {
			System.out.println("Exeption in push operation");
		}
		
	}
	
}
class PopOperation extends Thread implements stack{
	public void run() {
		try {
			for(int j=15;j<20;j++) {
				Thread.sleep(3000);
				if(st.empty()) {
					System.out.println("stack is empty and stack is"+st);
				}
				else {
					System.out.println("Deleted:"+st.pop()+"and stack:"+st);
				}
			}
		}catch (Exception e){
			System.out.println("Exeption in pop operation.");
		}
	}
	
}


public class PushAndPopImp {
	public static void main(String[] args) {
		
	
	PushOperation push_value = new PushOperation();
	PopOperation pop_value=new PopOperation();
	pop_value.start();
	push_value.start();
}
}
