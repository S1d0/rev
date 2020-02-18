package product.domain;

public interface ProductRepository {

    Product save(Product product);
    Product findByCategory(String categoryName);
}
