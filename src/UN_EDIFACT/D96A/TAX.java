package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TAX extends Segment {

    public E5283 e5283;
    public C241 eC241;
    public C533 eC533;
    public E5286 e5286;
    public C243 eC243;
    public E5305 e5305;
    public E3446 e3446;

    public TAX() {
        this(false);
    }

    public TAX(Boolean Mandatory) {
        super("TAX", "DUTY/TAX/FEE DETAILS", "Function: To specify relevant duty/tax/fee information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e5283, eC241, eC533, e5286, eC243, e5305, e3446}));
        e5283.setMandatory(true);
    }

}
