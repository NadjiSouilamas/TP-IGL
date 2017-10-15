import java.util.Vector;

public class VectorHelper{



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

    public static void afficherVector(Vector<Integer> t){

        for(int i=0;i<t.size();i++){

            System.out.println("index : "+i+"\tElement : "+t.get(i));

        }

    }

    public static void trierVector(Vector<Integer> t){

        boolean ordre = false;
        int indexMax = t.size() - 1;
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
}
