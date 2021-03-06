package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C085 extends CompositeElement {
    public E3479 e3479;
    public E1131 e1131;
    public E3055 e3055;
    public E3478 e3478;


    public C085() {
        this(false, null, null, null, null);
    }


    public C085(Boolean Mandatory, String s3479, String s1131, String s3055, String s3478) {
        super("C085", "MARITAL STATUS DETAILS", "To specify the marital status of a person.");
        this.setMandatory(Mandatory);
        e3479 = new E3479();
        e1131 = new E1131();
        e3055 = new E3055();
        e3478 = new E3478();
        e3479.setContent(s3479);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3478.setContent(s3478);
        addElement(e3479);
        addElement(e1131);
        addElement(e3055);
        addElement(e3478);
    }


}

