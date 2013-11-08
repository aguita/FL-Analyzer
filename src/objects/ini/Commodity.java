package objects.ini;

public class Commodity extends Good {

	private double rankRequired, repNeeded, minStock, maxStock, noSell,
			priceMultiplier;

	// TODO: I should modify this so I'm getting an overall lookup/status -- not
	// worrying about things. I should add a DOES this base sell an item, or
	// just buy it? That would help for looking upt hte prices, etc.

	public double getRankRequired() {
		return rankRequired;
	}

	public void setRankRequired(double rankRequired) {
		this.rankRequired = rankRequired;
	}

	public double getRepNeeded() {
		return repNeeded;
	}

	public void setRepNeeded(double repNeeded) {
		this.repNeeded = repNeeded;
	}

	public double getMinStock() {
		return minStock;
	}

	public void setMinStock(double minStock) {
		this.minStock = minStock;
	}

	public double getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(double maxStock) {
		this.maxStock = maxStock;
	}

	public double getNoSell() {
		return noSell;
	}

	public void setNoSell(double noSell) {
		this.noSell = noSell;
	}

	public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	/**
	 * Parses a line from the market_commodities.ini file and puts it into the
	 * Commodity object. It expects the line to be the following:<br>
	 * commodity_neodymium, 0, -1, 0, 0, 1, 48.240000<br>
	 * but can parse the fulle line correctly. <br>
	 * MarketGood = commodity_neodymium, 0, -1, 0, 0, 1, 48.240000
	 * 
	 * @param line
	 */
	public void parseMarketCommodityIni(String line) {
		// System.out.println("Parsing line: " + line);
		if (line.contains("=")) {
			line = line.substring(line.indexOf("=") + 1).trim();
		}
		String[] commodityFactors = line.split(",");
		nickname = commodityFactors[0];
		rankRequired = new Double(commodityFactors[1]).doubleValue();
		repNeeded = new Double(commodityFactors[2]).doubleValue();
		minStock = new Double(commodityFactors[3]).doubleValue();
		maxStock = new Double(commodityFactors[4]).doubleValue();
		noSell = new Double(commodityFactors[5]).doubleValue();
		priceMultiplier = new Double(commodityFactors[6]).doubleValue();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append(super.toString());
		sb.append("\nRank Required: " + rankRequired);
		sb.append("\nrepNeeded: " + repNeeded);
		sb.append("\nminStock: " + minStock);
		sb.append("\nmaxStock: " + maxStock);
		sb.append("\nnoSell: " + noSell);
		sb.append("\npriceMultiplier: " + priceMultiplier);
		return sb.toString();
	}
}
