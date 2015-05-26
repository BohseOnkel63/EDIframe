package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SGU extends Segment {

    public E9166 e9166;
    public E7299 e7299;
    public E6176 e6176;
    public E7168 e7168;
    public E1050 e1050;
    public E1049 e1049;
    public E4513 e4513;

    public SGU() {
        this(false);
    }

    public SGU(Boolean Mandatory) {
        super("SGU", "SEGMENT USAGE DETAILS", "Function: To specify the details of the usage of a segment");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9166, e7299, e6176, e7168, e1050, e1049, e4513}));
        e9166.setMandatory(true);
    }

}
