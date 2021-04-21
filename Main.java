import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<myVector> list = new ArrayList<>(Arrays.asList(
                new Vector2D(new Point2D(0, 13, 0, 0)),
                new Vector2D(new Point2D(0, 9, 0, 9)),
                new Vector2D(new Point2D(0, 0, 0, 3)),
                new Vector2D(new Point2D(0, 1, 0, 0)),

                new Vector3D(new Point3D(0, 13, 0, 0, 2, 3)),
                new Vector3D(new Point3D(0, 9, 0, 4, 0, 5)),
                new Vector3D(new Point3D(0, 0, 0, 3, 2, 4)),
                new Vector3D(new Point3D(0, 1, 0, 0, 1, 1))
        ));

        for (myVector tmp : list){
           System.out.println(tmp);
        }

        AnalyzeVector<myVector> analyzeList = new AnalyzeVector<>(list);
        System.out.println("\n");

        for (myVector tmp : analyzeList.analyze()){
            System.out.println(tmp);
        }

    }



















}
