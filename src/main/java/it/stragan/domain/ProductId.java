package it.stragan.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductId {

    private String title;
    private String created;

    @DynamoDBHashKey(attributeName = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @DynamoDBRangeKey(attributeName = "created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
