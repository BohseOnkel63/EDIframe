package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CUX extends Segment {

    public C504 eC504_1;
    public C504 eC504_2;
    public E5402 e5402;
    public E6341 e6341;

    public CUX() {
        this(false);
    }

    public CUX(Boolean Mandatory) {
        super("CUX", "CURRENCIES", "Function: To specify currencies used in the transaction and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC504_1, eC504_2, e5402, e6341}));
    }

}
