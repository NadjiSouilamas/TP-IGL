import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by teamloosers on 21/10/17.
 */
public class VectorHelperTest {

    Vector<Integer> vect1, vect2;

    @Before
    public void setUp() throws Exception {

        vect1 = new Vector<>();
        vect1.add(14);
        vect1.add(12);
        vect1.add(30);
        vect1.add(100);
        vect1.add(21);
        vect1.add(0);

        vect2 = new Vector<>();
        vect2.add(3);
        vect2.add(2);
        vect2.add(10);
        vect2.add(100);
        vect2.add(9);
        vect2.add(333);
    }

    @Test
    public void trierVector() throws Exception  {

        VectorHelper.trierVector(vect1);
        for(int i = 0; i < vect1.size() - 1; i++){

            boolean isLowerThanSucc = vect1.get(i) < vect1.get(i+1);
            assertTrue("Erreur dans le tri", isLowerThanSucc);
        }
    }

    @Test
    public void sumVectors() throws Exception {

        Vector<Integer> sumVect = VectorHelper.sumVectors(vect1, vect2);

        for (int i = 0; i < vect1.size(); i++)  {

            Integer expectedResult = vect1.get(i) + vect2.get(i);
            Integer actualValue = sumVect.get(i);

            assertEquals(expectedResult, actualValue);
        }
    }

    @Test
    public void inverserVector() throws Exception {

        Vector<Integer> initialVect = new Vector<Integer>();
        initialVect = ( Vector<Integer> ) vect1.clone();

        VectorHelper.inverserVector(vect1);

        for(int i = 0; i < vect1.size(); i++){

            boolean areSwitched = vect1.get(i) == initialVect.get( initialVect.size() - 1 - i );
            assertTrue("Erreur dans la procédure d'inversion", areSwitched);
        }
    }

    @Test
    public void getMinAndMax() throws Exception {

        Vector<Integer> minMaxVect = VectorHelper.getMinAndMax(vect1);

        Integer min = minMaxVect.get(0),
                max = minMaxVect.get(1);

        for (int i = 0; i < vect1.size(); i++)  {

            assertTrue(min <= vect1.get(i));
            assertTrue(max >= vect1.get(i));
        }
    }

    @Test
    public void applyFormula() throws Exception {

        Vector<Integer> initialVect = (Vector<Integer>) vect1.clone();

        VectorHelper.applyFormula(vect1);

        for (int i = 0; i < vect1.size(); i++)    {

            Integer initialValue = initialVect.get(i);
            Integer expectedResult = initialValue;
            VectorHelper.applyFormulaToInt(expectedResult);

            assertEquals(expectedResult, initialValue);
        }
    }
}