public class CocheMejorado {
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private double combustibleActual;
    private double consumo;
    private double kilometraje;

    public CocheMejorado(String marca, String modelo, int anyoFabricacion, int combustibleActual, double consumo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.combustibleActual = combustibleActual;
        this.consumo = consumo;
        this.kilometraje = kilometraje;
    }

    public CocheMejorado() {
    }

    public CocheMejorado(String marca, String modelo, int anyoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.combustibleActual = 0.0;
        this.consumo = 0.0;
        this.kilometraje = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public double getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void conducir(double kilometros) {
        this.combustibleActual = this.combustibleActual - this.consumo * kilometros;
        this.kilometraje = this.kilometraje + kilometros;
    }


    public void repostar(double litros) {
        this.combustibleActual = this.combustibleActual + litros;
    }


    public double getAutonomia(){
    return combustibleActual - consumo * kilometraje;
    }


    @Override
    public String toString() {
        return this.marca + " " + this.modelo;
    }
}
