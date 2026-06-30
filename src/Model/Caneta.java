package Model;

public class Caneta {

    private String cor;
    private double ponta;
    private boolean tampada;
    private boolean carga;
    private String material;

    public Caneta(){

    }

    public Caneta(String cor, double ponta, boolean tampada, boolean carga, String material) {
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
        this.carga = carga;
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}