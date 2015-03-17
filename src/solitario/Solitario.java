package solitario;

/**
 *
 * @author Borja Andrades
 */
public class Solitario {
    
    int tamañox,tamañoy;
    String[][] tablero ={{"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"},
                             {"*","*","*","*","*","*","*"},
                             {"*","*","*","0","*","*","*"},
                             {"*","*","*","*","*","*","*"},
                             {"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"}};
    //Metodo constructor con el tamaño x/y
    public void Solitario(int tamañox,int tamañoy){
       this.tamañox=tamañox;
       this.tamañoy=tamañoy;
    }
    
    //Metodo que dibuja el tablero
    @Override
    public String toString(){
        String tablerojuego = " ";
        for (int fila=0;fila<tamañox;fila++) {
            for (int columna = 0; columna<tamañoy; columna++) {
                 tablerojuego += tablero[fila][columna] +"   ";
            }
            tablerojuego += "\n";
        }
        return tablerojuego;   
}
    //Prueba metodo elemento vacio
    void ElmentoVacio(){
        if( tamañox ==4){
            if(tamañoy==4){
                tablero[tamañox][tamañoy] = null;
            }
        }
    }
    //Prueba metodo elemento vacio
    
    //Posicion inicial de tamaño x
    public void getposicionX(){
        
    }
    
    //Posicion inicial de tamaño y
    public void getposicionY(){
        
    }
}

    
 
