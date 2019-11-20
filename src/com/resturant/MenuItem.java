package com.resturant;

import java.util.Date;

public class MenuItem {
    private Integer menuItemId;
    private String menuItemName;
    private String menuItemDescription;
    private String menuItemCategory;
    private Double menuItemPrice;
    private Date menuItemLatestUpdateDate;



    public MenuItem(Integer menuItemId, String menuItemName, String menuItemDescription, String menuItemCategory, Double menuItemPrice, Date menuItemLatestUpdateDate) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.menuItemCategory = menuItemCategory;
        this.menuItemPrice = menuItemPrice;
        this.menuItemLatestUpdateDate = menuItemLatestUpdateDate;
    }

    public Integer getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void setMenuItemDescription(String menuItemDescription) {
        this.menuItemDescription = menuItemDescription;
    }

    public String getMenuItemCategory() {
        return menuItemCategory;
    }

    public void setMenuItemCategory(String menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }

    public Double getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(Double menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }

    public Date getMenuItemLatestUpdateDate() {
        return menuItemLatestUpdateDate;
    }

    public void setMenuItemLatestUpdateDate(Date menuItemLatestUpdateDate) {
        this.menuItemLatestUpdateDate = menuItemLatestUpdateDate;
    }


    @Override
    public String toString() {
        return "************\n" + "Item Id = " + menuItemId + "\n" +
                "Item Name = " + menuItemName + "\n" +
                "Item Description = " + menuItemDescription + "\n" +
                "Item Category = " + menuItemCategory + "\n" +
                "Item Price = " + menuItemPrice + "\n" +
                "Item Last Updated = " + menuItemLatestUpdateDate + "\n";
    }
}
