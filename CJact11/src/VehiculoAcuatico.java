public class VehiculoAcuatico extends Vehiculo{
    private int num_motores;
    public VehiculoAcuatico(String marca, String modelo, int aniofabricacion,int num_motores) {
        super(marca, modelo, aniofabricacion);
        this.num_motores=num_motores;
    }

    public int getNum_motores() {
        return num_motores;
    }

    public void setNum_motores(int num_motores) {
        this.num_motores = num_motores;
    }

    @Override
    public String mostrarMensaje (){
        return "El vehiculo de la marca "+ super.getMarca() +" con el modelo "+ super.getModelo() + " se fabricó en "+ super.getAniofabricacion() + " y tiene "+num_motores+" motores";
    }
}
