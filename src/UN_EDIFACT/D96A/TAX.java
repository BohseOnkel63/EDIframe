package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


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
        e5283 = new E5283();
        eC241 = new C241();
        eC533 = new C533();
        e5286 = new E5286();
        eC243 = new C243();
        e5305 = new E5305();
        e3446 = new E3446();
        addElement(e5283);
        addElement(eC241);
        addElement(eC533);
        addElement(e5286);
        addElement(eC243);
        addElement(e5305);
        addElement(e3446);
        e5283.setMandatory(true);
    }

}
