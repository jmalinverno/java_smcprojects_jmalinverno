package com.mycompany.deliverytruck;

public class Test {
    public static void main(String[] args) {
        // Instances of Letter
        Letter letter1 = new Letter("1900 Pico Blvd, Santa Monica, CA 90405", "SMC letter");
        Letter letter2 = new Letter("855 N Vermont Ave, Los Angeles, CA 90029", "LA City College letter");
        Letter letter3 = new Letter("16007 Crenshaw Blvd, Torrance, CA 90506", "El Camino College letter");
        Letter letter4 = new Letter("9000 Overland Ave, Culver City, CA 90230", "West LA College letter");
        Letter letter5 = new Letter("1500 N Verdugo Rd, Glendale, CA 91208", "Glendale Community College letter");

        // Instances of Package
        Item textbook = new Item();
        textbook.setName("Textbooks");
        textbook.setDescription("A book used as a standard work for the study of a particular subject.");
        Package package1 = new Package("1900 Pico Blvd, Santa Monica, CA 90405", new Item[]{textbook});

        Item electronics = new Item();
        electronics.setName("Electronics");
        electronics.setDescription("Electronic devices for educational purpose.");
        Package package2 = new Package("855 N Vermont Ave, Los Angeles, CA 90029", new Item[]{electronics});

        Item labEquipment = new Item();
        labEquipment.setName("Lab Equipment");
        labEquipment.setDescription("Science lab equipment for practical experiments.");
        Package package3 = new Package("16007 Crenshaw Blvd, Torrance, CA 90506", new Item[]{labEquipment});

        Item artSupplies = new Item();
        artSupplies.setName("Art Supplies");
        artSupplies.setDescription("Various supplies for art classes.");
        Package package4 = new Package("9000 Overland Ave, Culver City, CA 90230", new Item[]{artSupplies});

        Item sportsGear = new Item();
        sportsGear.setName("Sports Gear");
        sportsGear.setDescription("Equipment for kinesiology classes.");
        Package package5 = new Package("1500 N Verdugo Rd, Glendale, CA 91208", new Item[]{sportsGear});
        
        // Create a DeliveryTruck instance
        DeliveryTruck truck = new DeliveryTruck();
        truck.load(letter1);
        truck.load(letter2);
        truck.load(letter3);
        truck.load(letter4);
        truck.load(letter5);
        truck.load(package1);
        truck.load(package2);
        truck.load(package3);
        truck.load(package4);
        truck.load(package5);

        System.out.println(truck);
    }
}
