
package proyectoprograpoo;


public class Departamento {
    private int piso;
    private char depto;
    private String propietario;
    private String inquilino;
    private int gastos;
    private boolean disponible;
    
    public Departamento (int piso, char depto, String propietario, int gastos, boolean disponible){
            this.piso = piso;
            this.depto = depto;
            this.propietario = propietario;
            this.gastos = gastos;
            this.disponible = disponible;
            
    }
    public Departamento() {
    
    }
    
    public int getPiso() {
        return piso;
    }
    
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public char getDepto() {
        return depto;
    }
    
    public void setDepto(char depto) {
        this.depto = depto;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public void setPropietario(String propietario) {
       this.propietario = propietario;
    }
    
    public String getInquilino(){
        return inquilino;
    }
    
    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }
    public int getGastos() {
        return gastos;
    }
    
    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
