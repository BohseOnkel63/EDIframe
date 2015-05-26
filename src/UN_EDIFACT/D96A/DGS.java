package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DGS extends Segment {

    public E8273 e8273;
    public C205 eC205;
    public C234 eC234;
    public C223 eC223;
    public E8339 e8339;
    public E8364 e8364;
    public E8410 e8410;
    public E8126 e8126;
    public C235 eC235;
    public C236 eC236;
    public E8255 e8255;
    public E8325 e8325;
    public E8211 e8211;

    public DGS() {
        this(false);
    }

    public DGS(Boolean Mandatory) {
        super("DGS", "DANGEROUS GOODS", "Function: To identify dangerous goods.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e8273, eC205, eC234, eC223, e8339, e8364, e8410, e8126, eC235, eC236, e8255, e8325, e8211}));
    }

}
