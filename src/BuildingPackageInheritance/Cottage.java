package BuildingPackageInheritance;
public class Cottage extends BuildingParent {

    public Cottage(double latitude, double longitude, double squareFootage, String ownerName, double landArea,
                   int numberOfTrees, boolean hasSauna, double taxRate) {
        super(latitude, longitude, squareFootage, ownerName, landArea, numberOfTrees, hasSauna, taxRate);
    }
}
