package items;

/**
 * public public class Screen extends Item
 * 
 * @author olivivier MOREL
 */
public class Screen extends Item {

	/**
	 * @param String resolution
	 * 
	 *              Résolution de l'écran en pixels
	 *              L*H
	 *              modifieur d'accès = package
	 */
	String resolution;
	
	
	/**
	 * Constructeur Screen
	 * 
	 * @param brand
	 * @param prix
	 * @param String resolution
	 * 
	 *              Appel obligatoire du constructeur de la superclasse
	 *              Et attribution de la resolution
	 *              
	 */
	public Screen(Brand brand, float prix, String resolution) {
		super(brand, prix);
		this.resolution = resolution;
	}
	
	/**
	 * toString()
	 * 
	 * @return String : NomItem [Marque, Prix, resolution]
	 */
	public String toString() {
		return "brand=" + brand + ", prix=" + prix + ", résolution=" + resolution;
	}
	
	
	
}
