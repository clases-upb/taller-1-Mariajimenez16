/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        System.out.println(Convertir_km_seg(40));
        System.out.println(Convertir_cm_lt((double)3500));
        System.out.println(Convertir_us_cops((int)45623));
        System.out.println(Convertir_cent_far((float)0));
        System.out.println(Calcular_segs((short)1, (short)1, (short)1, (short)1));
        System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));
        System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
        System.out.println(Calcular_combustible((double) 638, 312, 1243, 220));
        System.out.println(Calcular_peso_luna((byte)80));

    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(double velocidad) {
        try {
            double m_s = velocidad * 1000;
            double m_h = velocidad * 1000 * 3600;
            String resultado = m_s + " m/s - " + m_h + " m/h";
            
            return resultado;   
        } catch (Exception e) {
            return  "Error en la conversión";
        }
    }
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
  public static float Convertir_cm_lt(double cc) {
        try {
         float  litros = (float) cc / 1000;
        return litros;
        } catch (Exception e) {
           return 0;
        }
           }
    
  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */

    public static int Convertir_us_cops(int pesos) {
        try {
         int dolares = pesos * 4170;
         return dolares;
        } catch (Exception e) {
           return  -1;
        }
    }
    
  
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
    public static float Convertir_cent_far(float gradosC) {
        try {
        float gradosF = 32 + (9 * gradosC / 5);
        return gradosF;
        } catch (Exception e) {
            return 0;
        }

    }

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
    public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {

        try {
            int seg= 0;
            seg = (dias * 60 * 60 * 24) + (horas * 60 * 60) + (minutos * 60) + segundos;
            return seg;
        } catch (Exception e) {
            return -1;
        }
    }
   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
    
public static String Calcular_peso_carga(float pesoCamionTotal, float pesoCamionVacio) {
        try {

         float  pesoNetoCargaTon = pesoCamionTotal - pesoCamionVacio;
         float  pesoNetoCargaKg = pesoCamionTotal - pesoCamionVacio * 1000;
         String  resultado = pesoNetoCargaKg + " kilos - " + pesoNetoCargaTon + " toneladas";
         return resultado;

        } catch (Exception e) {
         return"Error en la función Calcular_peso_carga";
        }

    }
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
public static float Calcular_horasxviaje(String destino, int distancia, int velocidadPromedio) {
    try {
        float horas = (float) distancia / velocidadPromedio;
        return horas;
    } catch (ArithmeticException e) {
        return -1;
    } catch (Exception e) {
        return -1;
    }
}
  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible(double[] rutas) {
    try {
        float consumoDespegue = 1.2f;
        float consumoAterrizaje = 0.4f;
        float consumoPorKm = 0.2f / 60.8f;
        float totalCombustible = 0;

        for (double ruta : rutas) {
            totalCombustible += consumoDespegue + consumoAterrizaje + (ruta * consumoPorKm);
        }

        return totalCombustible;
    } catch (Exception e) {
        return -1;
    }
}
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   public static double Calcular_peso_luna(byte pesoTierra) {
        try {
            double pesoTierraNewtons = pesoTierra * 9.81;
            double pesoLuna = pesoTierraNewtons * 0.165;
            return pesoLuna;
        } catch (Exception e) {
            return 0;
        }
    }

}
   
   

