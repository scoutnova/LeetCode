package ShipperQuestion;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShippingModuleTest {

    //這邊根據題目建構了四種不同的商品
    Merchandise merc01 = new Merchandise(10,10,10);
    Merchandise merc02 = new Merchandise(20,20,20);
    Merchandise merc03 = new Merchandise(30,30,30);
    Merchandise merc04 = new Merchandise(40,40,40);

    @Test
    public void calcShippingFee() throws Exception {
        int feeForMerc01withTCAT = ShippingModule.getInstance().calcShippingFee(merc01, ShippingModule.Shippers.TCAT);
        int feeForMerc02withTCAT = ShippingModule.getInstance().calcShippingFee(merc02, ShippingModule.Shippers.TCAT);
        int feeForMerc02withHCT = ShippingModule.getInstance().calcShippingFee(merc02, ShippingModule.Shippers.HCT);
        int feeForMerc03withPOST = ShippingModule.getInstance().calcShippingFee(merc03, ShippingModule.Shippers.POST);
        assertEquals(100, feeForMerc01withTCAT);
        assertEquals(200, feeForMerc02withTCAT);
        assertEquals(150, feeForMerc02withHCT);
        assertEquals(250, feeForMerc03withPOST);

    }

    @Test
    public void calcShippingFeeWithCoupon() throws Exception {

        int feeForMerc04withASAP = ShippingModule.getInstance().calcShippingFee(merc04, ShippingModule.Shippers.ASAP);
        String coupon = "AAAA5566";
        int feeForMerc04withASAPandCoupon = ShippingModule.getInstance().calcShippingFeeWithCoupon(merc04, ShippingModule.Shippers.ASAP, coupon);
        assertEquals(400, feeForMerc04withASAP);
        assertEquals(240, feeForMerc04withASAPandCoupon);
    }

}