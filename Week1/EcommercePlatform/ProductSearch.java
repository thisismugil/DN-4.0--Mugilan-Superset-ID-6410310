public class ProductSearch {
    static class Product {
        int itemCode;
        String itemName;
        String itemGroup;
        Product(int code, String name, String group) {
            this.itemCode = code;
            this.itemName = name;
            this.itemGroup = group;
        }
        @Override
        public String toString() {
            return "Product [Code=" +itemCode +", Name=" +itemName +", Category=" +itemGroup +"]";
        }
    }

    static Product linearSearch(Product[] inventory, int searchCode) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].itemCode == searchCode) {
                return inventory[i]; 
            }
        }
        return null; 
    }

    static Product binarySearch(Product[] sortedInventory, int searchCode) {
        int low = 0;
        int high = sortedInventory.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedInventory[mid].itemCode == searchCode) {
                return sortedInventory[mid];
            } else if (sortedInventory[mid].itemCode < searchCode) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return null;
    }

    static Product[] sortByCode(Product[] inventory) {
        Product[] sorted = inventory.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j].itemCode > sorted[j + 1].itemCode) {
                    Product temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(101, "Airpods", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(102, "Baggy-pant", "Clothing"),
            new Product(105, "Chinos", "Clothing"),
            new Product(104, "Adaptor", "Electronics")
        };

        System.out.println("Linear Search Results:");
        Product res1 = linearSearch(inventory, 102);
        System.out.println(res1 != null ? res1 : "404_Product not found");
        Product res2 = linearSearch(inventory, 999);
        System.out.println(res2 != null ? res2 : "404_Product not found");

        Product[] sortedInventory = sortByCode(inventory);

        System.out.println("\nBinary Search results:");
        Product res3 = binarySearch(sortedInventory, 102);
        System.out.println(res3 != null ? res3 : "404_Product not found");
        Product res4 = binarySearch(sortedInventory, 999);
        System.out.println(res4 != null ? res4 : "404_Product not found");

        System.out.println("\n Time Complexity:");
        System.out.println("Linear Search Time Complexity:");
        System.out.println("O(1)-Item in first");
        System.out.println("O(n)-Item is in the middle on average");
        System.out.println("O(n)-Item in last or not found");
        System.out.println("Binary Search Time Complexity:");
        System.out.println("O(1)-Item in middle first try");
        System.out.println("O(log n)-Search space halves each step");
        System.out.println("O(log n)-Item in end or not found");
        System.out.println("\n Best algo:");
        System.out.println("Binary search is better for an e-commerce");
        System.out.println("\n Why?");
        System.out.println("It is faster (O(log n) vs O(n)) for large product lists.");
        System.out.println("Products can be sorted once and reused for multiple searches.");
    }
}