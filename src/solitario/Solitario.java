package solitario;

/**
 *
 * @author Borja Andrades
 */
public class Solitario {
    
    int x,y;
    String[][] tablero ={{"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"},
                             {"*","*","*","*","*","*","*"},
                             {"*","*","*","0","*","*","*"},
                             {"*","*","*","*","*","*","*"},
                             {"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"}};
    
    public void Solitario(int x,int y){
       this.x=x;
       this.y=y;
    }
    
    @Override
    public String toString(){
        for (int fila=0;fila<x;fila++) {
            for (int columna = 0; columna<y; columna++) {
                
            }
        }
        return null;   
}
}

    
 
