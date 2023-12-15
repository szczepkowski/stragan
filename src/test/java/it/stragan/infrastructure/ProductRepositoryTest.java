package it.stragan.infrastructure;

import it.stragan.domain.Product;
import it.stragan.domain.ProductId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void testCreate() {
        Product bmw = Product.builder()
                .productId(ProductId.builder()
                        .title("Bmw E91 2011 301 km")
                        .created(LocalDateTime.now().toString())
                        .build())
                .description("Opis")
                .price(100f)
                .build();
        Product save = productRepository.save(bmw);
        assertEquals(save.getTitle(), "Bmw E91 2011 301 km");
    }
}