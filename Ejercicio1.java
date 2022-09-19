public class Ejercicio1 {
    /**
     * Esto es un comentario de documentacion
     * Ejercicio práctico de clases
     * Clase 14 - 14/09/22
     * @author comision 22922
     * @version 1.0
     */

     /*
     Esto es un comentario de bloque
     En este práctico vamos a realizar un HOLA MUNDO
     Lo vamos a imprimir por consola
      */

       //Esto es un comentario de linea - Seguidamente defino una clase
       public static void main(String[] args) {
        //1-Esto es un ejemplo de una sentencia para imprimir por consola un HOLA MUNDO
        System.out.println("HOLA, MUNDO");

      //2-Compilo con el boton verde

       /*
       * Primitivas y literales
       * a- Declaramos variables
       * b- Inicializamos las variables
       **/

       //Declaramos variables numericas
       byte miByte1, miByte2;
       short miShort1, miShort2;
       int miInt1, miInt2;
       long miLong;
       float miReal;
       double miReal2;


       //Inicializamos las variables numericas
       miByte1= -128;
       miByte2= 127;
       miShort1= 32767;
       miInt1= 2000000000;
       miLong= 1000000000;
       miReal= 2.56F;
       miReal2= 2.56;

       //Declaro variable del tipo caracter
        char respuesta;

       //Inicializo mi variable char
         respuesta= 'S';

       //Declaro una variable del tipo objeto para cadenas de caracteres
       String respuesta2;

       //Inicializo mi variable
       respuesta2= "Mi String";

       //Declaramos variables del tipo booleanas
       boolean evaluacion, evaluacion2;

       //Inicializamos la variable
         evaluacion=true;
         evaluacion2=false;

       //Instrucciones de salida
       System.out.println("miByte1 vale: "+ miByte1);
       System.out.println("miReal vale: "+ miReal);
       System.out.println("respuesta vale: "+ respuesta);
       System.out.println("evaluacion vale: "+ evaluacion);

    }

}
