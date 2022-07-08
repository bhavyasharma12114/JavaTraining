package Assignment2;
import java.util.LinkedList;
public class Q7AddSpecificElementLinkedList {

	  public static void main(String[] args) {

		     LinkedList<String> list = new LinkedList<String>();

		     list.add("AA");
		     list.add("BB");
		     list.add("CC");
		     list.add("DD");
		 
		     System.out.println("LinkedList Elements:"+list);

		     list.offer("NEW Element");//by this element will add at lkast.
		     list.offerFirst("Next Element");//by this element will add in first.
		     System.out.println("LinkedList After Addition:"+list);
		  }
}
