package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class AUT extends Segment {

    public E9280 e9280;
    public E9282 e9282;

    public AUT() {
        this(false);
    }

    public AUT(Boolean Mandatory) {
        super("AUT", "AUTHENTICATION RESULT", "Function: To specify results of the application of an");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9280, e9282}));
        e9280.setMandatory(true);
    }

}
