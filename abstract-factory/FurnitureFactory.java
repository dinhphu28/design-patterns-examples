// Super factory
public class FurnitureFactory {
	private FurnitureFactory() {}

	public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
		switch(materialType) {
			case PLASTIC:
				return new PlasticFactory();
			case WOOD:
				return new WoodFactory();
			default:
				throw new UnsupportedOperationException("This furniture is unsupported");
		}
	}
}
