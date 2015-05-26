package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PIA extends Segment {

    public E4347 e4347;
    public C212 eC212_1;
    public C212 eC212_2;
    public C212 eC212_3;
    public C212 eC212_4;
    public C212 eC212_5;
    public E1082 e1082;
    public E1229 e1229;
    public C292 eC292;
    public E7011 e7011;
    public E5495 e5495;
    public E1222 e1222;
    public E7083 e7083;

    public PIA() {
        this(false);
    }

    public PIA(Boolean Mandatory) {
        super("PIA", "ADDITIONAL PRODUCT ID", "Function: To specify details relating to pricing of a product.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4347, eC212_1, eC212_2, eC212_3, eC212_4, eC212_5, e1082, e1229, eC292, e7011, e5495, e1222, e7083}));
        e4347.setMandatory(true);
        eC212_1.setMandatory(true);
    }

}
