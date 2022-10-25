package site.metacoding.white.util;

import org.junit.jupiter.api.Test;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private String mcp;
}

@Setter
@Getter
class ProductDto {
    private String name;
    private Integer price;
    private Integer qty;

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
        // 3. ProductDto 객체 생성 (디폴트)
        // 4. Product -> ProductDto로 옮기기
        // 5. ProductDto -> product 변경
    }
}
