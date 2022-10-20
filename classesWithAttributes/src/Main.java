public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "laptop", "HP", 30000, 2, "Siyah", "L1" );
        /*Product product = new Product();
        product.setName("laptop");
        product.setId(1);
        product.setDescription("HP");
        product.setPrice(50000);
        product.setStockAmount(3);*/



        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());




    }
}
