import java.util.Scanner;
import java.util.Vector;

public class Main {

     public static void main(String arg[]){

         Vector<Integer> vect1 = new Vector<>();
         Vector<Integer> vect2 = new Vector<>();
         Vector<Integer> sumVect = new Vector<>();
         Scanner s = new Scanner(System.in);
         int number;
         int toAdd;
         int choice;

             System.out.print("Entrez le nombre d'élément du Vecteur Principal : ");
             number = s.nextInt();

             for (int i = 0; i < number; i++) {

                 System.out.print("Element numéro " + i + " : ");
                 toAdd = s.nextInt();
                 vect1.add(toAdd);
             }

         while( true ) {

             System.out.println("Choississez ce que vous voulez faire :");
             System.out.println("1- Tri");
             System.out.println("2- Inversion");
             System.out.println("3- Somme");
             System.out.println("4- Min et Max");
             System.out.println("5- Application de la formule");
             System.out.println("6- Fin");
             System.out.print("Entrez le niméro de votre choix : ");
             choice = s.nextInt();

             System.out.println("Vecteur initial :"+vect1);
             switch (choice) {

                 case 1:

                     VectorHelper.trierVector(vect1);
                     System.out.println("Vecteur après tri : " + vect1);
                     break;

                 case 2:

                     VectorHelper.inverserVector(vect1);
                     System.out.println("Vecteur après inversion : " + vect1);
                     break;

                 case 3:

                     System.out.print("Entrez le nombre d'élément du l'autre Vecteur  : ");
                     number = s.nextInt();

                     for (int i = 0; i < number; i++) {
                         System.out.print("Element numéro " + i + " : ");
                         toAdd = s.nextInt();
                         vect2.add(toAdd);
                     }


                     sumVect = VectorHelper.sumVectors(vect1, vect2);
                     System.out.println("Vecteur 1 : " + vect1 + "\nVecteur 2 : " + vect2 + "\nVecteur-Somme : " + sumVect);
                     break;

                 case 4:

                     Vector<Integer> minMaxVect = new Vector<>();
                     minMaxVect = VectorHelper.getMinAndMax(vect1);
                     System.out.println("Min : " + minMaxVect.get(0) + "\tMax : " + minMaxVect.get(1));
                     break;

                 case 5:
                     VectorHelper.applyFormula(vect1);
                     System.out.println("Vecteur après execution de la formule : " + vect1);
                     break;

                 default:

                     System.exit(1);
                     break;
             }
             System.out.println("------------------------------------------------------------------------------------------");
         }
     }
}
