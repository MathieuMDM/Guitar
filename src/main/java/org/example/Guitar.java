package org.example;

public class Guitar {
    private String serialNumber;
    private double priece;

    private GuitarSpec spec = new GuitarSpec();

    public Guitar(String serialNumber, double priece, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.priece = priece;
        this.spec = spec;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPriece() {
        return priece;
    }

    public void setPriece(double priece) {
        this.priece = priece;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
