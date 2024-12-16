package DataServiceExcercise;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MySqlDataServiceImpl implements DataService {
    public int[] retriveData() {
        // Some dummy data
        int[] data = {5, 1, 2, 15, 3};
        return data;
    }
}
