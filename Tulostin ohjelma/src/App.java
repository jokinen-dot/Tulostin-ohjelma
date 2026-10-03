public class App {
    public static void main(String[] args) throws Exception {


    // Tulostin ohjelman muuttujat

    String tekija = "Vili";
    double luku1 = 5;
    double luku2 = 2;
    double tulo = luku1 * luku2;
    double summa = luku1 + luku2;
    double erotus = luku1 - luku2;
    double jako = luku1 / luku2;



    // Tulostin ohjleman tulostukset

    System.out.println("Hei olen tulostin-ohjelma");
    


    System.out.println("Ohjelman tekija on: " + tekija);
        

        
    System.out.println("Luku1-muuttujan arvo on " + luku1);
        


    System.out.println("Luku2-muuttujan arvo on " + luku2);


    System.out.println("Lukujen tulo : " + tulo);


    System.out.println("Lukujen summa : " + summa);
    System.out.println("Lukujen erotus : " + erotus);
    System.out.println("Lukujen jako : " + jako);

    double keskiarvo = (luku1 + luku2) / 2; 

    System.out.println("Lukujen keskiarvo : " + keskiarvo); 

    System.out.println("Ohjelma suoritettu loppuun");










    }
}
