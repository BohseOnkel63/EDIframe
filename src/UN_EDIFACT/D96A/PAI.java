package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PAI extends Segment {

    public C534 eC534;

    public PAI() {
        this(false);
    }

    public PAI(Boolean Mandatory) {
        super("PAI", "PAYMENT INSTRUCTIONS", "Function: To specify the instructions for payment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC534}));
        eC534.setMandatory(true);
    }

}
