public class Vehiculo {
    private String marca;
    private String modelo;
    private int aniofabricacion=0;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, int aniofabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
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

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }
}
