package BuildingPackageInheritance;

public class Main {
    public static void main(String[] args) {

        Cottage cottage = new Cottage(45.67, 12.34, 360, "Kermo",
        13.9, 10, true, 20 );

        Duplex duplex = new Duplex(23.4, 32.1, 120, "Peeter",
                14.2, 0, false, 18);
        System.out.println(duplex.toString());

        Duplex duplex1 = new Duplex(23.1, 33.1, 140, "Kaur", 3,
                2, true, 21);
        System.out.println(duplex1.assessvalue());
    }
}
