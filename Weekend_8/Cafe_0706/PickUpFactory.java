package Weekend_8.Cafe_0706;

public class PickUpFactory {

    class Delivery implements Order.PickUp {

        private String address;
        Delivery(String str)
        {
            this.address = str;
        }

        public void handle(Order o)
        {

        }

    }

    class DriveThru implements Order.PickUp {

        private String vehicleNumber;
        DriveThru(String str)
        {
            this.vehicleNumber = str;
        }
        public void handle(Order o)
        {

        }
        // your code here

    }

    class TakeOut implements Order.PickUp {

        public void handle(Order o)
        {

        }
        // your code here

    }

    public Order.PickUp makeTakeOut (){

        return new TakeOut();

    }

    public Order.PickUp makeDriveThru (String vehicleNumber){

        return new DriveThru(vehicleNumber);

    }

    public Order.PickUp makeDelivery (String address){

        return new Delivery(address);

    }

}