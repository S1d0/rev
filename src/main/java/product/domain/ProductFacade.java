package product.domain;

public class ProductFacade {
    final ProductRepository productRepository;

    public ProductFacade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void doStuff() {
        System.out.println("Do stuff");
    }

}
