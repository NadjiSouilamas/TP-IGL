import java.util.Vector;

  /**
     * <h1>VectorHelper</h1>
     * <p>
     * The VectorHelper class contains several static methods to simplify many Integer vectors'
     * operations:
     * Sorting, Addition of two vectors, Reverse elements, Get max and min,
     * Apply a function to every element
     * </p>
     *
     * @author Abderraouf Safsaf & Mohamed Nadji Souilamas
     * @version 1.0
     * @since 2017-10-14
     */


public class VectorHelper{

    /**
    * This method is used to sort a Vector
    * @param t it's the Vector to sort ( will contain the result )
    */
    public static void trierVector(Vector<Integer> t){

        boolean ordre = false;
        int indexMax = t.size();
        int x;
        while(!ordre){

            ordre = true;
            for(int i=0;i < indexMax - 1 ; i++)
            {
                if(t.get(i) > t.get(i+1)){
                    x = t.get(i);
                    t.set(i,t.get(i+1));
                    t.set(i+1,x);
                    ordre = false;
                }
            }
            indexMax--;
        }
    }

    /**
     * This method is used to sum all the elements of two vectors and
     * return a new vector that contains the result.
     * <b>Note: The type of the two vectors is Integer and they
     * must have the same size.</b>
     * @param vect1 This is the first vector
     * @param vect2 This is the second vector
     * @return A Vector<Integer> that contains the result.
     */
    public static Vector<Integer> sumVectors(Vector<Integer> vect1, Vector<Integer> vect2) {

        Vector<Integer> sumVector = new Vector<>();
        try {

            if (vect1.size() != vect2.size())
                throw new DifferentVectorSizeException();

            for (int i = 0; i < vect1.size(); i++) {

                int sum = vect1.get(i) + vect2.get(i);
                sumVector.add(i, sum);
            }
        }
        catch (DifferentVectorSizeException e)  {

            System.out.println("Error: the vector1 & vector2 sizes are not equals");
        }

        return sumVector;
    }
    
    
    /**
    * This method is used to reverse a Vector
    * @param t it's the Vector to reverse ( will contain the result )
    */
    public static void inverserVector(Vector<Integer> t){

        int indexMax = t.size() - 1;
        System.out.println(" SIZE : "+indexMax);
        int indexMid = t.size() / 2 ;
        System.out.println(" middle : "+indexMid);
        int x;
        for( int i=0;i< indexMid ; i++){

            x = t.get(indexMax-i);
            System.out.println(" loop : "+i+"\tt["+(indexMax-i)+"] : "+x);

            t.set(indexMax-i,t.get(i));
            t.set(i,x);

        }
    }

    /**
     * This method get the minimum and the maximum value from a vector
     * @param vector A Vector<Integer> vector
     * @return A Vector which the first element contains the Min value and the second element
     * [1] contains the Max value
     */
    public static Vector<Integer> getMinAndMax(Vector<Integer> vector) {

        Vector<Integer> resultVector = new Vector<>();

        if (!vector.isEmpty())   {

            int min = vector.get(0), max = vector.get(0);
            for (int i = 0; i < vector.size(); i++) {

                int v = vector.get(i);
                if (v > max)
                    max = v;
                if (v < min)
                    min = v;
            }

            resultVector.add(min);
            resultVector.add(max);
        }

        return resultVector;
    }

    public static void applyFormulaToInt(Integer i) {

        i *= 2;
    }

    public static void applyFormula(Vector<Integer> vect)   {

        for (int i = 0; i < vect.size(); i++)   {

            applyFormulaToInt(vect.get(i));
        }
    }
}
