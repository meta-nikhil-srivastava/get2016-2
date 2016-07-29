package Session1;


public class ArrayListMain {

	public static void main(String []args)
	{
		MyArrayList<String> array=new MyArrayList<String>();
		MyArrayList<String> array1=new MyArrayList<String>();
		
		
		array.addElement("11");
		array.addElement("ayushi");
		array.addElement("12");
		array.addElement("a");
		array1.addElement("y");
		array1.addElement("u");
		array1.addElement("s");
		array1.addElement("h");
		array1.addElement("i");
		array.remove("12");
		array.removeAt(3);
		array1.sort();
		array.addElement("3", 1);
		for(int i=0;i<array.size();i++)
		{
			System.out.print("  "+array.getElement(i));
		}
	
		System.out.println();
		for(int i=0;i<array1.size();i++)
		{
			System.out.print("  "+array1.getElement(i));
		}
		
		System.out.println();
		array.addAll(array1);
		for(int i=0;i<array.size();i++)
		{
			System.out.print("  "+array.getElement(i));
		}
	
		
		
	}
}
