package Entidades;

public class Circunferencia {
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" +
                "radio=" + radio +
                '}';
    }
}
