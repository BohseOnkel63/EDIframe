package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ADR extends Segment {

    public C817 eC817;
    public C090 eC090;
    public E3164 e3164;
    public E3251 e3251;
    public E3207 e3207;
    public C819 eC819;
    public C517 eC517;

    public ADR() {
        this(false);
    }

    public ADR(Boolean Mandatory) {
        super("ADR", "ADDRESS", "Function: To specify an address.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC817, eC090, e3164, e3251, e3207, eC819, eC517}));
    }

}
