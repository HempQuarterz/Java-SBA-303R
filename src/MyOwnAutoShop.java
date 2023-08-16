public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan mySedan = new Sedan(132,34230.00, "Grey",16);

        System.out.println("Sedan Details: Charger");
        System.out.println("Speed: " + mySedan.speed + "mph");
        System.out.println("Color: " + mySedan.color);
        System.out.println("Length: " + mySedan.length + "ft");
        System.out.printf("Regular Price: $%,.0f\n" ,mySedan.regularPrice);
        System.out.printf("Sale Price: $%,.0f\n" , mySedan.getSalePrice());
        System.out.println();

        Ford ford1 = new Ford(110,33695.00,"Blue",2023,3000);
        Ford ford2 = new Ford(163,27779.00,"Black",2023,4000);

        System.out.println("Ford #1 Details: F-150");
        System.out.println("Speed: " + ford1.speed + "mph");
        System.out.println("Color: " + ford1.color);
        System.out.println("Year: " + ford1.year);
        System.out.printf("Regular Price: $%,.0f\n" , ford1.regularPrice);
        System.out.printf("Discount: $%,d\n" , ford1.manufacturerDiscount);
        System.out.printf("Sale Price: $%,.0f\n", ford1.getSalePrice());
        System.out.println();
        System.out.println("Ford #2 Details: Mustang");
        System.out.println("Speed: " + ford2.speed + "mph");
        System.out.println("Color: " + ford2.color);
        System.out.println("Year: " + ford2.year);
        System.out.printf("Regular Price: $%,.0f\n" , ford2.regularPrice);
        System.out.printf("Discount: $%,d\n" , ford2.manufacturerDiscount);
        System.out.printf("Sale Price: $%,.0f\n", ford2.getSalePrice());
        System.out.println();

        Truck myTruck = new Truck(115, 40350.00, "white", 7100);

        System.out.println("Truck Details: Nissan Titan");
        System.out.println("Speed: " + myTruck.speed + "mph");
        System.out.println("Color: " + myTruck.color);
        System.out.println("Weight: " + myTruck.weight + "lbs");
        System.out.printf("Regular Price: $%,.0f\n", myTruck.regularPrice);
        System.out.printf("Sale Price: $%,.0f\n", myTruck.getSalePrice());
        System.out.println();

        Car myCar = new Car(92, 27800.00, "Blue");

        System.out.println("Car Details: Chevy Bolt");
        System.out.println("Speed: " + myCar.speed + "mph");
        System.out.println("Color: " + myCar.color);
        System.out.printf("Regular Price: $%,.0f\n", myCar.regularPrice);
        System.out.printf("Sale Price: $%,.0f\n", myCar.getSalePrice());
        System.out.println();

    }
}
