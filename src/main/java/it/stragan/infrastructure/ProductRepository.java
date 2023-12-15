package it.stragan.infrastructure;

import it.stragan.domain.Product;
import it.stragan.domain.ProductId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface ProductRepository extends CrudRepository<Product, ProductId> {
}
