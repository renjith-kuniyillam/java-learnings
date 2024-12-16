package JavaBeans;

public class PojoRunner {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        pojo.setName("Renjith");
        pojo.setAge(30);
        System.out.println(pojo.getName());
        System.out.println(pojo.getAge());
    }
}
