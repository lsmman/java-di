package circular;

import org.springframework.beans.factory.annotation.Autowired;

public class ACircularObject {

    private BCircularObject bCircularObject;

//    public ACircularObject(BCircularObject bCircularObject) {
//        this.bCircularObject = bCircularObject;
//    }

    public ACircularObject() {
        System.out.println("hi");
    }

    @Autowired
    public void setbCircularObject(BCircularObject bCircularObject) {
        this.bCircularObject = bCircularObject;
    }
}
