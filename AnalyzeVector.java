import java.util.ArrayList;
import java.util.Comparator;

public class AnalyzeVector<T extends myVector> {
    //Fields
    private ArrayList<T> listVector;

    //Constructor
    public AnalyzeVector(ArrayList<T> listVector){
        this.listVector = listVector;
    }

    public ArrayList<T> analyze() {
        listVector.sort(new Comparator<myVector>() {
            @Override
            public int compare(myVector o1, myVector o2) {
                double v1;
                double v2;

                    v1 = o1.getVectorLength();
                    v2 = o2.getVectorLength();

                return Double.compare(v1, v2);

            }
        });
        return listVector;
    }

}
