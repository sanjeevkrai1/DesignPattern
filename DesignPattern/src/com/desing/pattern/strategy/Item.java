package com.desing.pattern.strategy;

public class Item {

	private String itemName;
	private String itemCode;
	private Double itemPrice;

	public Item(String itemName, String itemCode, Double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemCode=" + itemCode + ", itemPrice=" + itemPrice + "]";
	}

}
