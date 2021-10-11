package com.example.myapplication.ui.menu_money;

public class MoneyModel {
    private String name;
    private String money;
    private String description;
    private String index;

    public MoneyModel(String name, String money, String description, String index) {
        this.name = name;
        this.money = money;
        this.description = description;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
