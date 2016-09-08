package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PAI extends Segment {

    public C534 eC534;

    public PAI() {
        this(false);
    }

    public PAI(Boolean Mandatory) {
        super("PAI", "PAYMENT INSTRUCTIONS", "Function: To specify the instructions for payment.");
        this.setMandatory(Mandatory);
        eC534 = new C534();
        addElement(eC534);
        eC534.setMandatory(true);
    }

}
