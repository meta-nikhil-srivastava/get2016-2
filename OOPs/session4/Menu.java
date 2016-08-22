package assignment;

// abstract class for Menu implementing ActionMenu interface
public abstract class Menu implements ActionMenu
{	
	// name of menu
	protected String name;	
	
	//Constructor
	public Menu(String name)
	{	
		this.name = name;
	}
	
	//get name method
	public String getName()
	{	
		return name;
	}
	
	// abstract method to addMenu
	public abstract void addMenu(Menu menu);
	
	// abstract method to getSize
	public abstract int getSize();
	
	//abstract method to perform action 
	public abstract void actionPerformed(int index);
	
	// abstract method to getObject of Menu
	public abstract Menu getObject(int index);
	
}