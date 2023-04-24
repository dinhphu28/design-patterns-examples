// Client
public class Client {
	public static void main(String[] args) {
		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

		Chair chair = factory.createChair();
		chair.create();
		
		Table table = factory.createTable();
		table.create();
	}
}
