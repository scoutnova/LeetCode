package ShipperQuestion.Shipper;

import ShipperQuestion.Merchandise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Scoutnova
 */
public abstract class AbstractCouponShipper extends AbstractShipper {
    //TODO 4 這裡使用Map來實作折扣碼與其折扣的映對表, 這裡可能可以根據業務邏輯的不同有更好的資料結構，也是可以討論來進行修改的部分
    Map couponRedeemMap = new HashMap();

    AbstractCouponShipper(int defaultShippingFee) {
        super(defaultShippingFee);
    }

    void setCouponCase(String coupon, int discount) {
        couponRedeemMap.put(coupon, discount);
    }

    boolean validateCoupon(String coupon) {
        return couponRedeemMap.containsKey(coupon);
    }

    //不實作的原因來自於計算運費的方式可能會根據每個運貨商的不同而不同
    public abstract int calcShippingFeeWithCoupon(Merchandise merc, String coupon);
}
