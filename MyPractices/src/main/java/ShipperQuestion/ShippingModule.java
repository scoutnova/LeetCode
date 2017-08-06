package ShipperQuestion;

import ShipperQuestion.Shipper.CouponShipperASAP;
import ShipperQuestion.Shipper.ShipperHCT;
import ShipperQuestion.Shipper.ShipperPOST;
import ShipperQuestion.Shipper.ShipperTCAT;

/**
 * @author Scoutnova
 */
public class ShippingModule{
    //Singleton
    private volatile static ShippingModule inst = null;
    public static synchronized ShippingModule getInstance() {
        if (inst == null) {
            synchronized (ShippingModule.class) {
                if (inst == null)
                    inst = new ShippingModule();
            }
        }
        return inst;
    }
    public static enum Shippers {
        HCT,
        TCAT,
        POST,
        ASAP
    }

    //各家不同的運貨商在此實作，如果有新增其他運貨商就在此模組中新增，參數帶入的是預設的運費
    private ShipperTCAT tcat = new ShipperTCAT(200);
    private ShipperHCT hct = new ShipperHCT(999);
    private ShipperPOST post = new ShipperPOST(999);
    private CouponShipperASAP asap = new CouponShipperASAP(999);

    //Question 1的進入點，計算運貨商的運費
    public int calcShippingFee(Merchandise merc, Shippers shippers){
        int shippingFee;
        switch (shippers){
            case TCAT:
                shippingFee = tcat.calcShippingFee(merc);
                break;
            case HCT:
                shippingFee = hct.calcShippingFee(merc);
                break;
            case POST:
                shippingFee = post.calcShippingFee(merc);
                break;
            case ASAP:
                shippingFee = asap.calcShippingFee(merc);
                break;
            default:
                shippingFee = 0;
                break;
        }
        return shippingFee;
    }

    // Question2延伸的部分，計算有折扣碼的運貨商的運費
    public int calcShippingFeeWithCoupon(Merchandise merc, Shippers shippers, String coupon){
        //防呆, 若是沒輸入coupon或是coupon為空又呼叫了這個function, 讓他轉回到無折扣的function
        if (coupon == null || coupon.equals("")) {
            return calcShippingFee(merc, shippers);
        }

        //根據有折扣碼的運貨商來計算各自的運費
        int shippingFee;
        switch (shippers){
            case ASAP:
                shippingFee = asap.calcShippingFeeWithCoupon(merc, coupon);
                break;
            default:
                shippingFee = 0;
                break;
        }
        return shippingFee;
    }
}
