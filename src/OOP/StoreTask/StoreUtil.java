package OOP.StoreTask;

public class StoreUtil {

    public static void printProducts() {
        System.out.println("---------------------------------------");
        for (int i = 0; i < Store.productsCount; i++) {
            Product product = Store.products[i];
            if (product != null){
                System.out.println((i+1)+"-ci product: "+ product.name);
            }
        }
        System.out.println("---------------------------------------");
    }

    public static void searchProduct(String code) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < Store.productsCount; i++) {
            if (code.equals(Store.products[i].code)) {
                System.out.println("Product name: " + Store.products[i].name);
                System.out.println("Product price: " + Store.products[i].price);
                System.out.println("Product quantity: " + Store.products[i].quantity);
                System.out.println("Product createDate: " + Store.products[i].createDate);
            }
        }
        System.out.println("---------------------------------------");
    }
}
