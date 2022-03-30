package items;

/**
 * public class Item
 * 
 * Classe Mère des items
 * 
 * @author olivivie MOREL
 */
public abstract class Item {

	/**
	 * @param Brand brand
	 * 
	 *              Marque de l'item modifieur d'accès = package
	 */
	Brand brand;

	/**
	 * @param float prix
	 * 
	 *              Prix de l'item modifieur d'accès = package
	 */
	float prix;

	/**
	 * Constructeur Item
	 * 
	 * @param brand
	 * @param prix
	 */
	public Item(Brand brand, float prix) {
		this.brand = brand;
		this.prix = prix;
	}

	/**
	 * toString()
	 * 
	 * @return String : brand= nomItem , prix= prix and other
	 */
	@Override
	public abstract String toString();

}
