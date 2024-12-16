package JavaBeans;

import lombok.Data;

import java.io.Serializable;

@Data
public class PojoJavaBean implements Serializable {
    private String name;
    private int age;

    public PojoJavaBean() {
    }

}
