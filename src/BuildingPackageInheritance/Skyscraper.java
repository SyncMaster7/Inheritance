package BuildingPackageInheritance;

public class Skyscraper extends BuildingParent {

    private int numberOfFloors;

    public Skyscraper(double latitude, double longitude, double squareFootage, String ownerName, double landArea,
                      int numberOfTrees, boolean hasSauna, double taxRate) {
        super(latitude, longitude, squareFootage, ownerName, landArea, numberOfTrees, hasSauna, taxRate);
    }
}
