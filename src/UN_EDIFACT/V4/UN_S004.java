/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.V4;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;

/**
 *
 * @author mannelini
 */
public class UN_S004 {
    private final String Tag = "S004";
    private final String Description = "DATE AND TIME OF PREPARATION";
    private final String LongDescription  = "Date and time of preparation of the interchange.";
    private final boolean Mandatory = false;

    /**
     *
     */
    public UN_E0017 e0017;

    /**
     *
     */
    public UN_E0019 e0019;


    /**
     *
     */
    public UN_S004() {
        this(null, null);
    }
    
    /**
     *
     * @param s0017
     * @param s0019
     */
    public UN_S004(String s0017, String s0019) {
        e0017 = new UN_E0017(s0017);
        e0017.setMandatory(true);
        e0019 = new UN_E0019(s0019);
        e0019.setMandatory(true);
    }
    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            e0017.validate();
            e0019.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;

        output = e0017.toString() + ":" + e0019.toString();
        return EdiFunctions.trim(output);
    }

    public void setContent(String ediString) {
        String[] array = ediString.split(":");
        try {
            e0017.setContent(array[0]);
            e0019.setContent(array[1]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //System.out.println("UN_S004: ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }

    public String describe() {
        String output;
        output = this.Tag + " " + this.Description + " " + this.LongDescription + "\n" +
                "  " + e0017.describe() + "\n" +
                "  " + e0019.describe() + "\n";
        return output;
    }

}
