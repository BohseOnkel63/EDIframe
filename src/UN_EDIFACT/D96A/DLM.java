package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DLM extends Segment {

    public E4455 e4455;
    public C522 eC522;
    public C214 eC214;
    public E4457 e4457;

    public DLM() {
        this(false);
    }

    public DLM(Boolean Mandatory) {
        super("DLM", "DELIVERY LIMITATIONS", "Function: To specify limitations on deliveries.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4455, eC522, eC214, e4457}));
    }

}
