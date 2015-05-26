package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class LAN extends Segment {

    public E3455 e3455;
    public C508 eC508;

    public LAN() {
        this(false);
    }

    public LAN(Boolean Mandatory) {
        super("LAN", "LANGUAGE", "Function: To specify a language.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3455, eC508}));
        e3455.setMandatory(true);
    }

}
