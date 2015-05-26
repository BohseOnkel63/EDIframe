package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class APR extends Segment {

    public E4043 e4043;
    public C138 eC138;
    public C960 eC960;

    public APR() {
        this(false);
    }

    public APR(Boolean Mandatory) {
        super("APR", "ADDITIONAL PRICE INFORMATION", "Function: To provide information concerning pricing related to");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4043, eC138, eC960}));
    }

}
