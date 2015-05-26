package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class EFI extends Segment {

    public C077 eC077;
    public C099 eC099;
    public E1050 e1050;

    public EFI() {
        this(false);
    }

    public EFI(Boolean Mandatory) {
        super("EFI", "EXTERNAL FILE LINK IDENTIFICATION", "Function: To specify the link of one non-EDIFACT external file");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC077, eC099, e1050}));
        eC077.setMandatory(true);
    }

}
