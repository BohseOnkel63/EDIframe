package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ALC extends Segment {

    public E5463 e5463;
    public C552 eC552;
    public E4471 e4471;
    public E1227 e1227;
    public C214 eC214;

    public ALC() {
        this(false);
    }

    public ALC(Boolean Mandatory) {
        super("ALC", "ALLOWANCE OR CHARGE", "Function: To identify allowance or charge details.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e5463, eC552, e4471, e1227, eC214}));
        e5463.setMandatory(true);
    }

}
