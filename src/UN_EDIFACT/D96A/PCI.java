package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


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
        e4233 = new E4233();
        eC210 = new C210();
        e8275 = new E8275();
        eC827 = new C827();
        addElement(e4233);
        addElement(eC210);
        addElement(e8275);
        addElement(eC827);
    }

}
