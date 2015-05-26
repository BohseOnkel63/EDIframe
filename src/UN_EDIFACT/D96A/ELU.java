package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ELU extends Segment {

    public E9162 e9162;
    public E7299 e7299;
    public E1050 e1050;
    public E4513 e4513;

    public ELU() {
        this(false);
    }

    public ELU(Boolean Mandatory) {
        super("ELU", "DATA ELEMENT USAGE DETAILS", "Function: To specify the usage of a data element.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9162, e7299, e1050, e4513}));
        e9162.setMandatory(true);
    }

}
