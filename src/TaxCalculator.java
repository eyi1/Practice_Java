public class TaxCalculator {
    ArrayList<Item> shoppingList = new ArrayList<Item>();
    //ArrayList<Item> allItems = new ArrayList<Item>();

    //ArrayList allItems = new ArrayList();
    //Item[] items = new Item[0];
    //List<Item> allItems = new ArrayList();


    public void addShoppingItem(Item item) {
        shoppingList.add(item);
    }

    public double getSalesTax(Item item){
       double salesTax = item.getPrice() + item.getPrice() * .10;
       return salesTax;
    }

    public double getImportTax(Item item){
        double importTax = item.getPrice() + item.getPrice() * .05;
        return importTax;
    }

    public void calculateTax(Item item){
        String category = Item.getCategory();
        String type = Item.getType();
        
        if (type.equals("book") || category.equals("food") || category.equals("medical")){
            item.toString();
        }else{
            item.getSalesTax();
        }

        if (category.equals("imported")){
            item.getImportTax();
        }
    }

}


    // public String getCategory(String itemCategory){
    //     return this.category = itemCategory;
    // }

    // public String getType(String itemType){
    //     return this.type = itemType;
    // }

    // public double getPrice(double itemPrice){
    //     return this.price = itemPrice;
    // }

	// public int getQnt(int itemQuantity) {
	// 	return this.quantity = itemQuantity;
	// }
    