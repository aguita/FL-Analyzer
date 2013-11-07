package objects.ini;

import java.util.ArrayList;
import java.util.List;

public class Base {

	private String baseName;
	private List<Commodity> commodityList;
	private List<Ship> shipList;

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	public void addToCommodityList(Commodity commodity) {
		if (commodityList == null)
			commodityList = new ArrayList<Commodity>();
		commodityList.add(commodity);
	}

	public List<Commodity> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<Commodity> commodityList) {
		this.commodityList = commodityList;
	}

	public List<Ship> getShipList() {
		return shipList;
	}

	public void setShipList(List<Ship> shipList) {
		this.shipList = shipList;
	}

	public void addToShipList(Ship ship) {
		shipList.add(ship);
	}

}
