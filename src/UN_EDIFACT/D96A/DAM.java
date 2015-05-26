package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DAM extends Segment {

    public E7493 e7493;
    public C821 eC821;
    public C822 eC822;
    public C825 eC825;
    public C826 eC826;

    public DAM() {
        this(false);
    }

    public DAM(Boolean Mandatory) {
        super("DAM", "DAMAGE", "Function: To specify damage including action taken.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7493, eC821, eC822, eC825, eC826}));
        e7493.setMandatory(true);
    }

}
