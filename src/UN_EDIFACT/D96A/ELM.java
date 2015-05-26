package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ELM extends Segment {

    public E9150 e9150;
    public E9153 e9153;
    public E9155 e9155;
    public E9156 e9156;
    public E9158 e9158;
    public E9161 e9161;
    public E1507 e1507;
    public E4513 e4513;

    public ELM() {
        this(false);
    }

    public ELM(Boolean Mandatory) {
        super("ELM", "SIMPLE DATA ELEMENT DETAILS", "Function: To identify a simple data element and give related");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9150, e9153, e9155, e9156, e9158, e9161, e1507, e4513}));
        e9150.setMandatory(true);
    }

}
