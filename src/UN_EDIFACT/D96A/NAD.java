package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class NAD extends Segment {

    public E3035 e3035;
    public C082 eC082;
    public C058 eC058;
    public C080 eC080;
    public C059 eC059;
    public E3164 e3164;
    public E3229 e3229;
    public E3251 e3251;
    public E3207 e3207;

    public NAD() {
        this(false);
    }

    public NAD(Boolean Mandatory) {
        super("NAD", "NAME AND ADDRESS", "Function: To specify the name/address and their related");
        this.setMandatory(Mandatory);
        e3035 = new E3035();
        eC082 = new C082();
        eC058 = new C058();
        eC080 = new C080();
        eC059 = new C059();
        e3164 = new E3164();
        e3229 = new E3229();
        e3251 = new E3251();
        e3207 = new E3207();
        addElement(e3035);
        addElement(eC082);
        addElement(eC058);
        addElement(eC080);
        addElement(eC059);
        addElement(e3164);
        addElement(e3229);
        addElement(e3251);
        addElement(e3207);
        e3035.setMandatory(true);
    }

}
