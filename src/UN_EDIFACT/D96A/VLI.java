package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class VLI extends Segment {

    public C780 eC780;
    public C082 eC082;
    public E4405 e4405;
    public E1514 e1514;
    public E1507 e1507;
    public E1505 e1505;
    public C240 eC240;
    public E4513 e4513;

    public VLI() {
        this(false);
    }

    public VLI(Boolean Mandatory) {
        super("VLI", "VALUE LIST IDENTIFICATION", "Function: To identify a coded or non coded value list.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC780, eC082, e4405, e1514, e1507, e1505, eC240, e4513}));
        eC780.setMandatory(true);
    }

}
