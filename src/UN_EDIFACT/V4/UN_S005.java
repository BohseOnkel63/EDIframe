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
public class UN_S005 {
    private final String Tag = "S005";
    private final String Description = "RECIPIENT REFERENCE/PASSWORD DETAILS";
    private final String LongDescription  = "Reference or password as agreed between the communicating partners.";
    private final boolean Mandatory = false;

    /**
     *
     */
    public UN_E0022 e0022;

    /**
     *
     */
    public UN_E0025 e0025;


    /**
     *
     */
    public UN_S005() {
        this(null, null);
    }
    
    /**
     *
     * @param s0017
     * @param s0019
     */
    public UN_S005(String s0022, String s0025) {
        e0022 = new UN_E0022(s0022);
        e0022.setMandatory(true);
        e0025 = new UN_E0025(s0025);
    }
    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            e0022.validate();
            e0025.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;

        output = e0022.toString() + ":" + e0025.toString();
        return EdiFunctions.trim(output);
    }

    public void setContent(String ediString) {
        String[] array = ediString.split(":");
        try {
            e0022.setContent(array[0]);
            e0025.setContent(array[1]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //System.out.println("UN_S005: ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }

   public String describe() {
        String output;
        output = this.Tag + " " + this.Description + " " + this.LongDescription + "\n" +
                "  " + e0022.describe() + "\n" +
                "  " + e0025.describe() + "\n";
        return output;
    }

}
