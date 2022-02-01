
public class clientBuilderTest {
   public static void main(String[] args) {
	Laptop laptop1= new Laptop.Laptopbuilder("40","50","80").build();
	Laptop laptop2= new Laptop.Laptopbuilder("40","50","80").setGraphicsEnable(true).build();
	
	System.out.println("LAptop1 " + laptop1);
	System.out.println("LAptop1 " + laptop2);
}
}
