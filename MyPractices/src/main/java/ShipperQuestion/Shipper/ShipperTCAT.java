package ShipperQuestion.Shipper;

import ShipperQuestion.Box;
import ShipperQuestion.Merchandise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Scoutnova
 */
public class ShipperTCAT extends AbstractShipper {
    //每一家貨運商會有自己的盒子
    private Box TCATBox01 = new Box(10,10,10);

    public ShipperTCAT(int defaultShippingFee) {
        super(defaultShippingFee);
        //初始化運費表的運費, 依據每個箱子的不同而不同
        //TODO 1 箱子與運費的資料來源在哪裡? 是不是會在模組中處理並傳入
        addBox(TCATBox01, 100);
    }
}
