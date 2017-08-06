package ShipperQuestion.Shipper;

import ShipperQuestion.Box;
import ShipperQuestion.Merchandise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Scoutnova
 */
public class CouponShipperASAP extends AbstractCouponShipper {

    private Box ASAPBox01 = new Box(40,40,40);
    public CouponShipperASAP(int defaultShippingFee) {
        super(defaultShippingFee);
        //TODO 1 箱子與運費的資料來源在哪裡? 是不是會在模組中處理並傳入
        addBox(ASAPBox01, 400);
        //TODO 3 折扣碼與折扣的資料來源在哪裡? 是不是會在模組中處理並傳入
        setCouponCase("AAAA5566", 160);
    }

    @Override
    public int calcShippingFeeWithCoupon(Merchandise merc, String coupon) {
        int fee = calcShippingFee(merc);
        if (validateCoupon(coupon)){
            return feeDiscountByCoupon(fee, coupon);
        }
        return fee;
    }

    private int feeDiscountByCoupon(int fee, String coupon){
        if (!validateCoupon(coupon)) {
            System.out.println("[WARNING] Coupon is not in CouponCase");
            return fee;
        }

        int discount = (int) couponRedeemMap.get(coupon);
        int result = fee - discount;
        if (result < 0){
            System.out.println("[WARNING] Calcated Fee lower than 0");
            result = 0;
        }
        return result;
    }
}
