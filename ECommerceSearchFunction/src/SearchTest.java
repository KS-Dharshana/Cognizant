public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Monitor", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Mouse", "Accessories"),
                new Product(102, "Headphones", "Audio")

        };

        System.out.println("----- Linear Search -----");

        Product result1 = SearchAlgorithms.linearSearch(products, 104);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        SearchAlgorithms.sortProducts(products);

        System.out.println("\n----- Binary Search -----");

        Product result2 = SearchAlgorithms.binarySearch(products, 104);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}