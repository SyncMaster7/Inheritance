package BuildingPackageInheritance;

public class BuildingParent {

    private double latitude;
    private double longitude;
    private double squareFootage;
    private String ownerName;
    private double landArea;
    private int numberOfTrees;
    private boolean hasSauna;
    private double taxRate;

    public BuildingParent(double latitude, double longitude, double squareFootage, String ownerName, double landArea,
                   int numberOfTrees, boolean hasSauna, double taxRate) {

        this.latitude = latitude;
        this.longitude = longitude;
        this.squareFootage = squareFootage;
        this.ownerName = ownerName;
        this.landArea = landArea;
        this.numberOfTrees = numberOfTrees;
        this.hasSauna = hasSauna;
        this.taxRate = taxRate;
    }

    public double assessValue() {
        return getSquareFootage() * 100;
    }
    public double calculateTaxBill() {
        return assessValue() * .04;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public void setNumberOfTrees(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    public boolean isHasSauna() {
        return hasSauna;
    }

    public void setHasSauna(boolean hasSauna) {
        this.hasSauna = hasSauna;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
