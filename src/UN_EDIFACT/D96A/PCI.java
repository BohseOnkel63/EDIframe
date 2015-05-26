package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PCI extends Segment {

    public E4233 e4233;
    public C210 eC210;
    public E8275 e8275;
    public C827 eC827;

    public PCI() {
        this(false);
    }

    public PCI(Boolean Mandatory) {
        super("PCI", "PACKAGE IDENTIFICATION", "Function: To specify markings and labels on individual packages");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4233, eC210, e8275, eC827}));
    }

}
