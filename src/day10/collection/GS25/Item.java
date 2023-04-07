package day10.collection.GS25;

import day04.array.StringList;

public class Item {

    private String category;
    private StringList snackList;

    public Item() {
    }

    public Item(String category, StringList snackList) {
        this.category = category;
        this.snackList = snackList;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public StringList getSnackList() {
        return snackList;
    }

    public void setSnackList(StringList snackList) {
        this.snackList = snackList;
    }
}



