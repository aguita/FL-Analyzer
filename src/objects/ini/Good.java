package objects.ini;

public abstract class Good {

	public String nickname, idPrefix, equipmentName, categoryType;
	public Double basePrice;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIdPrefix() {
		return idPrefix;
	}

	public void setIdPrefix(String idPrefix) {
		this.idPrefix = idPrefix;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCategory Type:" + categoryType);
		sb.append("\nNickname:" + nickname);
		sb.append("\nidPrefix:" + idPrefix);
		sb.append("\nbasePrice:" + basePrice);
		
		
		return sb.toString();
	}

}
