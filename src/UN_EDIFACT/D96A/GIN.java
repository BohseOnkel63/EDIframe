package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GIN extends Segment {

    public E7405 e7405;
    public C208 eC208_1;
    public C208 eC208_2;
    public C208 eC208_3;
    public C208 eC208_4;
    public C208 eC208_5;

    public GIN() {
        this(false);
    }

    public GIN(Boolean Mandatory) {
        super("GIN", "GOODS IDENTITY NUMBER", "Function: To give specific identification numbers, either as");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7405, eC208_1, eC208_2, eC208_3, eC208_4, eC208_5}));
        e7405.setMandatory(true);
        eC208_1.setMandatory(true);
    }

}
