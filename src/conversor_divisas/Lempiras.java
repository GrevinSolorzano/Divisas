package conversor_divisas;


public class Lempiras {

    private double cant_inicial;
    private double cant_final;
    private int indice_objetivo;
    
    
    public Lempiras() {
    }

    public double getCant_inicial() {
        return cant_inicial;
    }

    public void setCant_inicial(double cant_inicial) {
        this.cant_inicial = cant_inicial;
    }

    public double getCant_final() {
        return cant_final;
    }

    public void setCant_final(double cant_final) {
        this.cant_final = cant_final;
    }

    public int getIndice_objetivo() {
        return indice_objetivo;
    }

    public void setIndice_objetivo(int indice_objetivo) {
        this.indice_objetivo = indice_objetivo;
    }
    
    public void conversion(int IndiceObjetivo){
        if(IndiceObjetivo == 0){
            cant_final = cant_inicial * 1;
        }
        if(IndiceObjetivo == 1){
            cant_final = cant_inicial * 0.041;
        }
        if(IndiceObjetivo == 2){
            cant_final = cant_inicial * 0.034;
        }
        if(IndiceObjetivo == 3){
            cant_final = cant_inicial * 0.90;
        }
    }
    
    
    
    
}
