package site.metacoding.white.util;

import org.junit.jupiter.api.Test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private String mcp; // 제조사

    @Builder
    public Product(Integer id, String name, Integer price, Integer qty, String mcp) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.mcp = mcp;
    }

}

@Getter
@Setter
class ProductDto {
    private String name;
    private Integer price;
    private Integer qty;

    public ProductDto(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.qty = product.getQty();
    }

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .price(price)
                .qty(qty)
                .build();
    }

}

public class MapperTest {

    @Test
    public void 고급매핑하기() {
        // toEntitym toDto 만들어서 매핑해보기
    }

    @Test
    public void 매핑하기1() {
        // 1. Product 객체 생성 (디폴트)
        // 2. 값 넣기
        Product product = Product.builder()
                .id(1)
                .name("닌텐도 스위치")
                .price(160000)
                .mcp("닌텐도")
                .qty(15)
                .build();
        // 3. ProductDto 객체생성 (디폴트)
        ProductDto productDto = new ProductDto(product);

        // 5. ProductDto -> product 변경
        Product product2 = productDto.toEntity();
    }
}
