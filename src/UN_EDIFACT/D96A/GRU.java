package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GRU extends Segment {

    public E9164 e9164;
    public E7299 e7299;
    public E6176 e6176;
    public E4513 e4513;
    public E1050 e1050;

    public GRU() {
        this(false);
    }

    public GRU(Boolean Mandatory) {
        super("GRU", "SEGMENT GROUP USAGE DETAILS", "Function: To specify the usage of a segment group within a");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9164, e7299, e6176, e4513, e1050}));
        e9164.setMandatory(true);
    }

}
