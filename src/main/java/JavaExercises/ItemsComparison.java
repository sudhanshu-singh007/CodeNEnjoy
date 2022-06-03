package JavaExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Phone {
    private String itemName;
    private int itemPrice;
    private int itemRating;

    Phone(String itemName, int itemPrice, int itemRating) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemRating = itemRating;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getItemRating() {
        return itemRating;
    }

    @Override
    public String toString() {
        return getItemName() + "--" + getItemPrice() + "--" + getItemRating();
    }

}


class ItemNameCompare implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getItemName().compareTo(o2.getItemName());
    }
}

class ItemPriceCompare implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getItemPrice() > o2.getItemPrice() ? 1 : o1.getItemPrice() < o2.getItemPrice() ? -1 : 0;
    }
}

class ItemRatingCompare implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getItemRating() > o2.getItemRating() ? 1 : o1.getItemRating() < o2.getItemRating() ? -1 : 0;
    }
}


public class ItemsComparison {

    public static void main(String[] args) {
        Phone samsungPhone = new Phone("C Samsung_Note", 10000, 1);
        Phone nokiaPhone = new Phone("D Nokia_Lumia", 5000, 3);
        Phone googlePhone = new Phone("B Google_Pixel", 15000, 5);
        Phone applePhone = new Phone("A iPhone_6", 20000, 4);

        List<Phone> allPhones = new ArrayList<>();
        allPhones.add(samsungPhone);
        allPhones.add(nokiaPhone);
        allPhones.add(googlePhone);
        allPhones.add(applePhone);

        System.out.println("DEFAULT: ");
        for (Phone p : allPhones) {
            System.out.println(p.toString());
        }

        Collections.sort(allPhones, new ItemNameCompare());
        System.out.println("\nNAME SORTING: ");
        for (Phone p : allPhones) {
            System.out.println(p.toString());
        }

        Collections.sort(allPhones, new ItemPriceCompare());
        System.out.println("\nPRICE SORTING: ");
        for (Phone p : allPhones) {
            System.out.println(p.toString());
        }

        Collections.sort(allPhones, new ItemRatingCompare());
        System.out.println("\nRATING SORTING: ");
        for (Phone p : allPhones) {
            System.out.println(p.toString());
        }
    }
}