package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PNA extends Segment {

    public E3035 e3035;
    public C206 eC206;
    public C082 eC082;
    public E3403 e3403;
    public E3397 e3397;
    public C816 eC816_1;
    public C816 eC816_2;
    public C816 eC816_3;
    public C816 eC816_4;
    public C816 eC816_5;

    public PNA() {
        this(false);
    }

    public PNA(Boolean Mandatory) {
        super("PNA", "PARTY NAME", "Function: To specify information necessary to establish the");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3035, eC206, eC082, e3403, e3397, eC816_1, eC816_2, eC816_3, eC816_4, eC816_5}));
        e3035.setMandatory(true);
    }

}
