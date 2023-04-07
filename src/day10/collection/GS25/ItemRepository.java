package day10.collection.GS25;

import day04.array.StringList;

public class ItemRepository {

    public static Item[] itemList;

    static {
        itemList = new Item[0];
    }

    // 신규 카테고리에 첫 제품 추가
    public void addNewItem(String itemName, String snackName) {

        Item item = new Item(itemName, new StringList(snackName));

        Item[] temp = new Item[itemList.length + 1];
        for (int i = 0; i < itemList.length; i++) {
            temp[i] = itemList[i];
        }
        temp[temp.length-1] = item;
        itemList = temp;
    }





    // 카데고리 수 반환
    public int count() {
        return itemList.length;
    }







}
