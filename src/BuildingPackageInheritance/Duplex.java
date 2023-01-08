package BuildingPackageInheritance;

public class Duplex extends BuildingParent {

    public Duplex(double latitude, double longitude, double squareFootage, String ownerName, double landArea,
                  int numberOfTrees, boolean hasSauna, double taxrate) {
        super(latitude, longitude, squareFootage, ownerName, landArea, numberOfTrees, hasSauna, taxrate);
    }

    public String toString() {
        return "The duplex at " + this.getLatitude() + ", " + this.getLongitude() + " is " + getSquareFootage()
                + " square feet, is owned by " + this.getOwnerName() + " and sits on " + getLandArea() + " acres.";
    }

    public double assessvalue() {
        return this.getSquareFootage() * 85;
    }

    public double calculateTaxBill() {
        return assessvalue() * .025;
    }
}
