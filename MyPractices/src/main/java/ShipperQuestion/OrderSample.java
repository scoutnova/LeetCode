package ShipperQuestion;

/**
 * @author Scoutnova
 */

public class OrderSample {

    static ShippingModule shippingModule;
    public static void main(String[] args) {
        //初始化各個模組，在此場景中只有一個計算運費的模組
        initModules();

        //這邊根據題目建構了四種不同的箱子
        Merchandise merc01 = new Merchandise(10,10,10);
        Merchandise merc02 = new Merchandise(20,20,20);
        Merchandise merc03 = new Merchandise(30,30,30);
        Merchandise merc04 = new Merchandise(40,40,40);

        //題目 1
        int feeForMerc01withTCAT = shippingModule.calcShippingFee(merc01, ShippingModule.Shippers.TCAT);
        int feeForMerc02withTCAT = shippingModule.calcShippingFee(merc02, ShippingModule.Shippers.TCAT);
        int feeForMerc02withHCT = shippingModule.calcShippingFee(merc02, ShippingModule.Shippers.HCT);
        int feeForMerc03withPOST = shippingModule.calcShippingFee(merc03, ShippingModule.Shippers.POST);
        System.out.println("Shipping Fee for Merc01 with TCAT: "+ feeForMerc01withTCAT);
        System.out.println("Shipping Fee for Merc01 with TCAT: "+ feeForMerc02withTCAT);
        System.out.println("Shipping Fee for Merc02 with HCT: "+ feeForMerc02withHCT);
        System.out.println("Shipping Fee for Merc03 with POST: "+ feeForMerc03withPOST);

        //題目 2
        int feeForMerc04withASAP = shippingModule.calcShippingFee(merc04, ShippingModule.Shippers.ASAP);
        String coupon = "AAAA5566";
        int feeForMerc04withASAPandCoupon = shippingModule.calcShippingFeeWithCoupon(merc04, ShippingModule.Shippers.ASAP, coupon);

        System.out.println("Shipping Fee for Merc04 with ASAP: "+ feeForMerc04withASAP);
        System.out.println("Shipping Fee for Merc05 with ASAP: "+ feeForMerc04withASAPandCoupon);
    }
    static void initModules(){
        shippingModule = ShippingModule.getInstance();
    }
}
