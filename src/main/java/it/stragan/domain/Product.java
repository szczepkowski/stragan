package it.stragan.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class Product {

    @Id
    private ProductId productId;
    private String description;
    private Float price;

    @DynamoDBHashKey(attributeName = "title")
    public String getTitle() {
        return productId != null ? productId.getTitle() : null;
    }

    public void setTitle(String title) {
        if (productId == null) {
            productId = ProductId.builder().build();
        }
        productId.setTitle(title);
    }

    @DynamoDBRangeKey(attributeName = "created")
    public String getCreated() {
        return productId != null ? productId.getCreated() : null;
    }

    public void setCreated(String releaseDateTime) {
        if (productId == null) {
            productId = ProductId.builder().build();
        }
        productId.setCreated(releaseDateTime);
    }

    @DynamoDBAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
