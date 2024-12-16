package DataServiceExcercise;


import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class MongoDbDataServiceImpl implements DataService {
    public int[] retriveData() {
        // Some dummy data
        int[] data = {5, 1, 2, 15, 3};
        return data;
    }
}
