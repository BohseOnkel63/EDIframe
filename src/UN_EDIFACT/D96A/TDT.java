package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TDT extends Segment {

    public E8051 e8051;
    public E8028 e8028;
    public C220 eC220;
    public C228 eC228;
    public C040 eC040;
    public E8101 e8101;
    public C401 eC401;
    public C222 eC222;
    public E8281 e8281;

    public TDT() {
        this(false);
    }

    public TDT(Boolean Mandatory) {
        super("TDT", "DETAILS OF TRANSPORT", "Function: To specify the transport details such as mode of");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e8051, e8028, eC220, eC228, eC040, e8101, eC401, eC222, e8281}));
        e8051.setMandatory(true);
    }

}
