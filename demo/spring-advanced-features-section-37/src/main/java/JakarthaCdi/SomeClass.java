package JakarthaCdi;


import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeClass {
    public SomeDependancy getSomeDependancy() {
        return someDependancy;
    }

//    @Autowired
    @Inject
    public void setSomeDependancy(SomeDependancy someDependancy) {
        this.someDependancy = someDependancy;
    }

    private SomeDependancy someDependancy;

}
