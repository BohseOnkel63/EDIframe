/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIframe;

/**
 *
 * @author mannelini
 * CHARSET A   :+'?
 * CHARSET B   \037 = IS 1 (:)
 *             \035 = IS 3 (+)
 *             \034 = IS 4 (')
 *             \000
 */
public class UNAsegment {
    
    private String UNAstring;

    /**
     *
     * @param UNAstring
     */
    public UNAsegment(String UNAstring) {
        this.setUNAstring(UNAstring);
    }

    UNAsegment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public String getUNAstring() {
        return UNAstring;
    }

    private void setUNAstring(String UNAstring) {
        this.UNAstring = UNAstring;
    }
    
    /**
     *
     */
    public void print() {
        System.out.println("UNA, SERVICE STRING ADVICE");
        try {
            System.out.println("  COMPONENT DATA ELEMENT SEPARATOR <" + UNAstring.charAt(3) + ">");
            System.out.println("  DATA ELEMENT SEPARATOR           <" + UNAstring.charAt(4) + ">");
            System.out.println("  DECIMAL NOTATION                 <" + UNAstring.charAt(5) + ">");
            System.out.println("  RELEASE INDICATOR                <" + UNAstring.charAt(6) + ">");
            System.out.println("  Reserved for future              <" + UNAstring.charAt(7) + ">");
            System.out.println("  SEGMENT TERMINATOR               <'>\n");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("UNA segmentti '" + UNAstring + "' on virheellinen!");
        }
    }
    
    /**
     *
     * @param UNAstr
     */
    public void print(String UNAstr) {
        this.setUNAstring(UNAstr);
        this.print();
    }
    
    /**
     *
     * @return
     */
    public String getText() {
        String Response;
        Response = "UNA, SERVICE STRING ADVICE\n";
        try {
            Response = Response + "  COMPONENT DATA ELEMENT SEPARATOR <" + UNAstring.charAt(3) + ">\n";
            Response = Response + "  DATA ELEMENT SEPARATOR           <" + UNAstring.charAt(4) + ">\n";
            Response = Response + "  DECIMAL NOTATION                 <" + UNAstring.charAt(5) + ">\n";
            Response = Response + "  RELEASE INDICATOR                <" + UNAstring.charAt(6) + ">\n";
            Response = Response + "  Reserved for future              <" + UNAstring.charAt(7) + ">\n";
            Response = Response + "  SEGMENT TERMINATOR               <'>\n";
        } catch (StringIndexOutOfBoundsException e) {
            Response = "UNA segmentti '" + UNAstring + "' on virheellinen!";
        }
        return Response;
    }

    /**
     *
     */
    public void printHTML() {
        System.out.println("<table style=\"width:100%\">");
        System.out.println("<tr><th colspan=\"3\">UNA, SERVICE STRING ADVICE</th></tr>");

        try {
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "COMPONENT DATA ELEMENT SEPARATOR", UNAstring.charAt(3));
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "DATA ELEMENT SEPARATOR", UNAstring.charAt(4));
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "DECIMAL NOTATION", UNAstring.charAt(5));
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "RELEASE INDICATOR", UNAstring.charAt(6));
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "Reserved for future", UNAstring.charAt(7));
            System.out.format("<tr><td style=\"width:60%%\">%s</td><td><b>%s</b></td></tr>\n", "SEGMENT TERMINATOR", "'");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("UNA segmentti " + UNAstring + " on virheellinen!");
        }

        System.out.println("</table>");
        System.out.println("<br>");
    } 
    
    /**
     *
     * @param UNAstr
     */
    public void printHTML(String UNAstr) {
        this.setUNAstring(UNAstr);
        this.printHTML();
    }

}
