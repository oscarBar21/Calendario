public class CalendarioBasico{
    private int dia;
    private int mes;
    private int ano;
    
    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        ano = 1;
    } 
    
    public String obtenerFecha(){
       String fechaActual = dia + "-" + mes + "-" + ano;
       return fechaActual;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public void avanzarFecha(){
        if(dia < 30){
            dia = dia + 1;
        }
        else{
            dia = 1;
            if(mes < 12){
                mes = mes + 1;
            }
            else {
                mes = 1;
                if(ano < 2099){
                    ano = ano + 1; 
                }
                else{
                    dia = 1;
                    mes = 1;
                    ano = 1;  
                }
            }
        }
    }
}
