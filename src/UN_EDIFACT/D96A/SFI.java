package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

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
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7164, eC814, eC815, e4513}));
        e7164.setMandatory(true);
    }

}
