        package question1;
        
        /**
         * Décrivez votre classe FahrenheitCelsius ici.
         * 
         * @author (Rami TOFEILY)
         * @version (0.0.1)
         */
        import java.math.RoundingMode;
        import java.text.DecimalFormat;
        public class FahrenheitCelsius {
        
            /**
             * le point d'entrée de cette application, dont le commentaire est à
             * compléter
             * 
             * @param args
             *            ...
             */
            public static void main(String[] args) {
                // pour tous les paramètres de la ligne de commande
            int fahrenheit = 0;
            float celsius = 0;
            DecimalFormat df = new DecimalFormat("#.#");
            df.setRoundingMode(RoundingMode.DOWN);
            for (int index = 0; index< args.length; index++){
                celsius = fahrenheitEnCelsius(Integer.parseInt(args[index]));
                System.out.println(fahrenheit + "\u00B0F -> " + ((int)(celsius*10)/10.0) + "\u00B0C");
            }              
                                                                                
    }

            /**
             * la méthode à compléter.
             * 
             * @param f
             *            la valeur en degré Fahrenheit
             * @return la conversion en degré Celsius
             */
            
            public static float fahrenheitEnCelsius(int f) {
                return (float) 5 / 9 * (f-32);
               }

}
