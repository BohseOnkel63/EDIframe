package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CTA extends Segment {

    public E3139 e3139;
    public C056 eC056;

    public CTA() {
        this(false);
    }

    public CTA(Boolean Mandatory) {
        super("CTA", "CONTACT INFORMATION", "Function: To identify a person or a department to whom");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3139, eC056}));
    }

}
