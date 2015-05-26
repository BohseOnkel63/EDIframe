package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class BGM extends Segment {

    public C002 eC002;
    public E1004 e1004;
    public E1225 e1225;
    public E4343 e4343;

    public BGM() {
        this(false);
    }

    public BGM(Boolean Mandatory) {
        super("BGM", "BEGINNING OF MESSAGE", "Function: To indicate the type and function of a message and to");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC002, e1004, e1225, e4343}));
    }

}
