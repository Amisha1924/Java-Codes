class Room {
    double width;
    double height;
    double breadth;

    Room(double width, double height, double breadth) {
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }

    public double calculateVolume() {
        return width * height * breadth;
    }
}
class RoomDemo {
    public static void main(String[] args) {
        // Creating instances of Room
        Room room1 = new Room(10.5, 8.2, 6.0);
        Room room2 = new Room(12.0, 9.8, 5.5);
        // Calculating volumes of the rooms
        double volume1 = room1.calculateVolume();
        double volume2 = room2.calculateVolume();
        // Displaying volumes
        System.out.printf("Volume of Room 1: %.2f cubic units\n",volume1);
        System.out.printf("Volume of Room 2: %.2f cubic units\n",volume2);
    }
}

