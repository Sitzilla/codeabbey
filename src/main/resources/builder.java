package main.resources;
import main.resources.mathFunctions;

/**
 * Created by evan on 8/16/15.
 */
public class builder {

    public builder() { };

    public int[] buildIntArrayFromInput() {


    }


    public String[] tokenizeString() {
        String line;
        StringBuffer stringBuffer = new StringBuffer();


        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
        }

        String[] tokens = stringBuffer.toString().split(" ");

    }
}
