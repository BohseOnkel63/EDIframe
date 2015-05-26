package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PRI extends Segment {

    public C509 eC509;
    public E5213 e5213;
    public E4407 e4407;
    public E7039 e7039;
    public C526 eC526;
    public E7045 e7045;
    public E7047 e7047;
    public C514 eC514_1;
    public C514 eC514_2;
    public C514 eC514_3;

    public PRI() {
        this(false);
    }

    public PRI(Boolean Mandatory) {
        super("PRI", "PRICE DETAILS", "Function: To define the physical sample parameters associated");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC509, e5213, e4407, e7039, eC526, e7045, e7047, eC514_1, eC514_2, eC514_3}));
    }

}
