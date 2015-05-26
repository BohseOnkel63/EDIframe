package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SCD extends Segment {

    public E7497 e7497;
    public C786 eC786;
    public C082 eC082;
    public E4405 e4405;
    public E1222 e1222;
    public C778 eC778;
    public C240 eC240;

    public SCD() {
        this(false);
    }

    public SCD(Boolean Mandatory) {
        super("SCD", "STRUCTURE COMPONENT DEFINITION", "Function: To specify a component of a data structure (e.g. an");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7497, eC786, eC082, e4405, e1222, eC778, eC240}));
        e7497.setMandatory(true);
    }

}
