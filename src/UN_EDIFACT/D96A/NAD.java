package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class NAD extends Segment {

    public E3035 e3035;
    public C082 eC082;
    public C058 eC058;
    public C080 eC080;
    public C059 eC059;
    public E3164 e3164;
    public E3229 e3229;
    public E3251 e3251;
    public E3207 e3207;

    public NAD() {
        this(false);
    }

    public NAD(Boolean Mandatory) {
        super("NAD", "NAME AND ADDRESS", "Function: To specify the name/address and their related");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3035, eC082, eC058, eC080, eC059, e3164, e3229, e3251, e3207}));
        e3035.setMandatory(true);
    }

}
