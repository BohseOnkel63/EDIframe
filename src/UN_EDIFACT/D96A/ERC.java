package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ERC extends Segment {

    public C901 eC901;

    public ERC() {
        this(false);
    }

    public ERC(Boolean Mandatory) {
        super("ERC", "APPLICATION ERROR INFORMATION", "Function: To identify the type of application error within a");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC901}));
        eC901.setMandatory(true);
    }

}
