package objects.ini;

/**
 * 
 * @author Ryan Waterer
 *
 */
public class Ship extends Good {

	private String shipName;

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public void shipNameToString(String shipName) {
		this.shipName = shipName;
	}

}
