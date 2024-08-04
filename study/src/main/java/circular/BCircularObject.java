package circular;

import org.springframework.beans.factory.annotation.Autowired;

public class BCircularObject {

    private ACircularObject aCircularObject;

//    public BCircularObject(ACircularObject aCircularObject) {
//        this.aCircularObject = aCircularObject;
//    }

    @Autowired
    public void setaCircularObject(ACircularObject aCircularObject) {
        this.aCircularObject = aCircularObject;
    }
}
