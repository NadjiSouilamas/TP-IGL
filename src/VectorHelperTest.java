import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by teamloosers on 21/10/17.
 */
public class VectorHelperTest {


    Vector<Integer> v1 = new Vector<>(), v2 = new Vector<>();

    @Before
    public void setUp() throws Exception {

        v1.add(14);
        v1.add(12);
        v1.add(30);
        v1.add(100);
        v1.add(21);
        v1.add(0);

        v2.add(3);
        v2.add(2);
        v2.add(10);
        v2.add(100);
        v2.add(9);
        v2.add(333);
    }

    @Test
    public void trierVector() throws Exception  {

        VectorHelper.trierVector(v1);
        for(int i = 0; i < v1.size() - 1; i++){

            boolean isLowerThanSucc = v1.get(i) < v1.get(i+1);
            assertTrue("Erreur dans le tri", isLowerThanSucc);
        }
    }

    @Test
    public void sumVectors() throws Exception {

        Vector<Integer> sumVect = VectorHelper.sumVectors(v1, v2);

        for (int i = 0; i < v1.size(); i++)  {

            Integer expectedResult = v1.get(i) + v2.get(i);
            Integer actualValue = sumVect.get(i);

            assertEquals(expectedResult, actualValue);
        }
    }

    @Test
    public void inverserVector() throws Exception {

        Vector<Integer> initialVect = new Vector<Integer>();
        initialVect = ( Vector<Integer> ) v1.clone();

        VectorHelper.inverserVector(v1);

        for(int i = 0; i < v1.size(); i++){

            boolean areSwitched = v1.get(i) == initialVect.get( initialVect.size() - 1 - i );
            assertTrue("Erreur dans la procédure d'inversion", areSwitched);
        }
    }

    @Test
    public void getMinAndMax() throws Exception {

        Vector<Integer> minMaxVect = VectorHelper.getMinAndMax(v1);

        Integer min = minMaxVect.get(0),
                max = minMaxVect.get(1);

        for (int i = 0; i < v1.size(); i++)  {

            assertTrue(min <= v1.get(i));
            assertTrue(max >= v1.get(i));
        }
    }

    @Test
    public void applyFormula() throws Exception {

        Vector<Integer> initialVect = (Vector<Integer>) v1.clone();

        VectorHelper.applyFormula(v1);

        for (int i = 0; i < v1.size(); i++)    {

            Integer initialValue = initialVect.get(i);
            Integer expectedResult = initialValue;
            VectorHelper.applyFormulaToInt(expectedResult);

            assertEquals(expectedResult, initialValue);
        }
    }
}