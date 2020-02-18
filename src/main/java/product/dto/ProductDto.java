package product.dto;

import product.domain.Category;

public class ProductDto {
    private String name;
    private Long price;
    private Category category;

    private ProductDto() {}

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        final ProductDto dto;

        private Builder() {
            this.dto = new ProductDto();
        }

        public Builder name(String name) {
            dto.name = name;
            return this;
        }

        public Builder price(Long price) {
            dto.price = price;
            return this;
        }

        public Builder category(Category category) {
            dto.category = category;
            return this;
        }
        public ProductDto build() {
            return dto;
        }
    }
}
