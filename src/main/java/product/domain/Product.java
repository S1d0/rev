package product.domain;

import product.dto.ProductDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
class Product {
    @Id
    Long id;
    String name;
    Long price;
    Category category;

    ProductDto dto() {
        return ProductDto.builder()
                .name(name)
                .price(price)
                .category(category)
                .build();
    }

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }
}
