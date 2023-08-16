public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan mySedan = new Sedan(132,34.230, "Grey",16);

        System.out.println("Sedan Details: Charger");
        System.out.println("Speed: " + mySedan.speed + "mph");
        System.out.println("Color: " + mySedan.color);
        System.out.println("Length: " + mySedan.length + "ft");
        System.out.printf("Regular Price: $%,.0f\n" ,mySedan.regularPrice * 1000);
        System.out.printf("Sale Price: $%,.0f\n" , mySedan.getSalePrice() * 1000);
        System.out.println();

        Ford ford1 = new Ford(110,33.695,"Blue",2023,3000);
        Ford ford2 = new Ford(163,27.779,"Black",2023,4000);

        System.out.println("Ford #1 Details: F-150");
        System.out.println("Speed: " + ford1.speed + "mph");
        System.out.println("Color: " + ford1.color);
        System.out.println("Year: " + ford1.year);
        System.out.printf("Regular Price: $%,.0f\n" , ford1.regularPrice *1000);
        System.out.printf("Discount: $%,d\n" , ford1.manufacturerDiscount);
        System.out.println();
        System.out.println("Ford #2 Details: Mustang");
        System.out.println("Speed: " + ford2.speed + "mph");
        System.out.println("Color: " + ford2.color);
        System.out.println("Year: " + ford2.year);
        System.out.printf("Regular Price: $%,.0f\n" , ford2.regularPrice * 1000);
        System.out.printf("Discount: $%,d\n" , ford2.manufacturerDiscount);
        System.out.println();


    }
}
