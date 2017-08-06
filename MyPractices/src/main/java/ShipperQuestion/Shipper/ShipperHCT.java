package ShipperQuestion.Shipper;

import ShipperQuestion.Box;
import ShipperQuestion.Merchandise;

import java.util.HashMap;

/**
 * @author Scoutnova
 */
public class ShipperHCT extends AbstractShipper{
    //每一家貨運商會有自己的盒子
    private Box HCTBox01 = new Box(20,20,20);

    public ShipperHCT(int defaultShippingFee) {
        super(defaultShippingFee);
        //初始化運費表的運費, 依據每個箱子的不同而不同
        //TODO 1 箱子與運費的資料來源在哪裡? 是不是會在模組中處理並傳入
        addBox(HCTBox01, 150);
    }
}
