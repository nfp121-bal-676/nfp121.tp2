package question2;


         /**
         * Décrivez votre classe FahrenheitCelsius ici.
         * 
         * @author (Rami TOFEILY)
         * @version (0.0.1)
         */
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
           int fahrenheit = 0;
            float celsius = 0;
            for (int index = 0; index< args.length; index++){
                try {
                    celsius = fahrenheitEnCelsius(Integer.parseInt(args[index]));
                    System.out.println(fahrenheit + "\u00B0F -> " + ((int)(celsius*10)/10.0) + "\u00B0C");
                } catch(NumberFormatException nfe){
                    System.out.println("error : " + nfe.getMessage()); 
                }    
            }   
      
      
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       return 5 / 9.0f * (f-32);
    }

}
