package items;

/**
 * public public class Mouse extends Item
 * 
 * @author olivivier MOREL
 */
public class Mouse extends Item {

	/**
	 * Constructeur Mouse
	 * 
	 * @param brand
	 * @param prix
	 * 
	 *              Appel obligatoire du constructeur de la superclasse
	 */
	public Mouse(Brand brand, float prix) {
		super(brand, prix);
	}
	public String toString() {
		return "brand=" + brand + ", prix=" + prix;
	
	}
}
