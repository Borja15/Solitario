package solitario;

import javax.swing.JOptionPane;

/**
 *
 * @author Borja Andrades
 */
public class Solitario {
    
    int tamañox,tamañoy;
    int posicionx,posiciony;
    String[][] tablero ={{"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"},
                             {"*","*","*","*","*","*","*"},
                             {"*","*","*","0","*","*","*"},
                             {"*","*","*","*","*","*","*"},
                             {"#","#","*","*","*","#","#"},
                             {"#","#","*","*","*","#","#"}};
    
    //Metodo constructor con el tamaño x/y
    public void Solitario(int tamañox,int tamañoy){
       this.tamañox =tamañox;
       this.tamañoy =tamañoy;
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
//    void ElmentoVacio(){
//        if( tamañox ==4){
//            if(tamañoy==4){
//                tablero[tamañox][tamañoy] = null;
//            }
//        }
//    }
    //Prueba metodo elemento vacio
    
    //posicionX inicial
    Integer getPosicionX(){
        return posicionx;
    }
    
    //posicionYinicial
    Integer getPosicionY(){
        return posiciony;
    }
    
   public void comprobarMovimiento(int posicionx,int posiciony){
      this.posicionx = posicionx;
      this.posiciony = posiciony;
      if(posicionx>tamañox){
          String error = (true) ? "ERROR:SALES DEL TABLERO  POSICIONX INCORRECTA" : "";
          JOptionPane.showMessageDialog(null,error,"Posicion Incorrecta",JOptionPane.INFORMATION_MESSAGE);
      }else{
          if(posiciony>tamañoy){
              String error = (true) ? "ERROR:SALES DEL TABLERO  POSICIONY INCORRECTA" : "";
              JOptionPane.showMessageDialog(null,error,"Posicion Incorrecta",JOptionPane.INFORMATION_MESSAGE);
          }
      }
   }
   
   String Mover(){
        return null;  
   }
   
//   String deshacer(){
//       
//   }
}

    
 
