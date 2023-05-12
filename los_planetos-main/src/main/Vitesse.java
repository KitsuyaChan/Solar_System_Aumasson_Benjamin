package main;

public class Vitesse {
    private double vitesseX;
    private double vitesseY;



    public Vitesse(double vitesseX, double vitesseY) {
        this.vitesseX = vitesseX;
        this.vitesseY = vitesseY;
    }



    public double getVitesseX() { return vitesseX; }
    public double getVitesseY() { return vitesseY; }



    public void setVitesseX(double vitesseX) { this.vitesseX = vitesseX; }
    public void setVitesseY(double vitesseY) { this.vitesseY = vitesseY; }
}