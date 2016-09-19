import java.util.Scanner;
import java.util.Iterator;

public class BSTTest
{
    public static void main(String[] args)
    {
	BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();

	String test1 = "a 10 a 5 a 15 a 1 a 20 a 2 a 17";

	Scanner in = new Scanner(test1);
	//Scanner in = new Scanner(System.in);

	
	while (in.hasNext())
	    {
		String command = in.next();
		if (command.toLowerCase().startsWith("a"))
		    {
			int i = in.nextInt();
			t.add(i);
		    }
		else if (command.toLowerCase().startsWith("r"))
		    {
			int i = in.nextInt();
			t.remove(i);
		    }
		else
		    {
			in.nextLine();
		    }
		t.validate();
		
		Iterator<Integer> i = t.inorderIterator();
		while (i.hasNext())
		    {
			System.out.print(i.next() + " ");
		    }
		System.out.println();
	    }
	System.out.println(t);
    }
}
