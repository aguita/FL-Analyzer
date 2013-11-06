package objects;

import java.util.TreeMap;

public class GoodsLookup {

	private TreeMap<String, String> commodityMap, systemMap, baseMap;

	public TreeMap<String, String> getCommodityMap() {
		return commodityMap;
	}

	public void setCommodityMap(TreeMap<String, String> commodityMap) {
		this.commodityMap = commodityMap;
	}

	public TreeMap<String, String> getSystemMap() {
		return systemMap;
	}

	public void setSystemMap(TreeMap<String, String> systemMap) {
		this.systemMap = systemMap;
	}

	public TreeMap<String, String> getBaseMap() {
		return baseMap;
	}

	public void setBaseMap(TreeMap<String, String> baseMap) {
		this.baseMap = baseMap;
	}

	public void addToSystemsMap(String nickname, String name) {
		if (systemMap == null)
			systemMap = new TreeMap<String, String>();
		systemMap.put(nickname, name);
	}

	public void addToBaseMap(String nickname, String name) {
		if (baseMap == null)
			baseMap = new TreeMap<String, String>();
		baseMap.put(nickname, name);
	}

	public void addToCargoMap(String nickname, String name) {
		if (commodityMap == null)
			commodityMap = new TreeMap<String, String>();
		commodityMap.put(nickname, name);
	}
}
