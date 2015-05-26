package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class NAT extends Segment {

    public E3493 e3493;
    public C042 eC042;

    public NAT() {
        this(false);
    }

    public NAT(Boolean Mandatory) {
        super("NAT", "NATIONALITY", "Function: To specify a nationality.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3493, eC042}));
        e3493.setMandatory(true);
    }

}
