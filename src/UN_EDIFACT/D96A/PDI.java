package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PDI extends Segment {

    public E3499 e3499;
    public C085 eC085;
    public C101 eC101;

    public PDI() {
        this(false);
    }

    public PDI(Boolean Mandatory) {
        super("PDI", "PERSON DEMOGRAPHIC INFORMATION", "Function: To specify items of person demographic information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3499, eC085, eC101}));
    }

}
