
package ventarodadosusados;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventarodadosusados {

    public static void main(String[] args) {
        
        //1.Vector con tipo de rodados
        String [] rodados = new String [3];
        rodados[0] = "0 - Rodados";
        rodados[1] = "1 - Autos";
        rodados[2] = "2 - Motos";
        
        //atributto cantidad de puertas es unico de clase autos (ejercicio 4)
        String [] cantPuertas = new String [4];
        cantPuertas[0] = "2";
        cantPuertas[1] = "3";
        cantPuertas[2] = "4";
        cantPuertas[3] = "5";
        
        int cantpuertasok = 0;
        
        //2. Variables
        String valorTS = "";
        int valorTI = 0;
        
        //1a. Bienvenida
        ImageIcon bienvenida = new ImageIcon("src/img/bienvenida.jpg");
        JOptionPane.showMessageDialog(null,"", "Publique su rodado para la venta!",JOptionPane.INFORMATION_MESSAGE,bienvenida);
    
        while (valorTI == 0){ 
            valorTS = (String) JOptionPane.showInputDialog(null,"", "Elija tipo de rodado",JOptionPane.QUESTION_MESSAGE,null,rodados,rodados[0]);
                 String sCadena = valorTS;
                    //seleccionamos el primer caracter
                    String sSubCadena = sCadena.substring(0,1);
                    //lo convertimos en entero
                    valorTI = Integer.parseInt(sSubCadena);  
             
        }
        
        //construimos objetos
        autos c1 = new autos();
        motos c2 = new motos();
        
     switch (valorTI){
          case 1:
          System.out.println(valorTI);
          c1.confirmaopcion();
          //****************************************
          //ejecutamos metodo que tiene clase autos
          c1.pedir();
          //ejecutamos metodo que tiene clase autos
          c1.printmarca();

          break;
          case 2:
          System.out.println(valorTI);
          c2.confirmaopcion();
          break;
     }
         
    }
    
}
