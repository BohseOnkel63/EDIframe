package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SFI extends Segment {

    public E7164 e7164;
    public C814 eC814;
    public C815 eC815;
    public E4513 e4513;

    public SFI() {
        this(false);
    }

    public SFI(Boolean Mandatory) {
        super("SFI", "SAFETY INFORMATION", "Function: To identify regulatory safety information.");
        this.setMandatory(Mandatory);
        e7164 = new E7164();
        eC814 = new C814();
        eC815 = new C815();
        e4513 = new E4513();
        addElement(e7164);
        addElement(eC814);
        addElement(eC815);
        addElement(e4513);
        e7164.setMandatory(true);
    }

}
