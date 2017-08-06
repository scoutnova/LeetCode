package ShipperQuestion.Shipper;

import ShipperQuestion.Box;
import ShipperQuestion.Merchandise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Scoutnova
 */
public abstract class AbstractShipper {
    protected int defaultShippingFee;
    //TODO 2 這裡使用Map來實作盒子與運費的映對表, 這裡可能可以根據業務邏輯的不同有更好的資料結構，也是可以討論來進行修改的部分
    protected Map shippingFeeMap;

    AbstractShipper(int defaultShippingFee) {
        this.defaultShippingFee = defaultShippingFee;
        shippingFeeMap = new HashMap();
    }

    public void addBox(Box box, int fee) {
        shippingFeeMap.put(box, fee);
    }

    public int calcShippingFee(Merchandise merc) {
        int fee = defaultShippingFee;
        Iterator it = shippingFeeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Box box = (Box) pair.getKey();
            int value = (int) pair.getValue();
            if (Merchandise.isMercFitInBox(merc, box))
                fee = value;
        }

        return fee;
    }


}
