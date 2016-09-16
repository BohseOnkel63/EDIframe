/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIframe;

import UN_EDIFACT.D96A.*;
import UN_EDIFACT.ValidityException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mannelini
 */
public class EDIframe {
    
    /**
     *
     */
    public EDIframe() {

        Properties eProperties;
        eProperties = new Properties();
        
        BGM sBGM;
        sBGM = new BGM();
        DTM sDTM;
        sDTM = new DTM();
        FTX sFTX;
        sFTX = new FTX();
        NAD sNAD;
        sNAD = new NAD();
        
        
        sBGM.eC002.e1001.setContent("380");
        sBGM.eC002.e3055.setContent("123");
        //sBGM.eC002.e1000.setContent("1000");
        sBGM.e1004.setContent("123456789");
        sBGM.e1225.setContent("9");
        
        sDTM.eC507.e2005.setContent("334");
        sDTM.eC507.e2380.setContent("20160909");
        sDTM.eC507.e2379.setContent("102");
        try {
            sBGM.validate();
            sDTM.validate();
            System.err.println("BGM: " + sBGM.toString());
            System.err.println("DTM: " + sDTM.toString());
            //System.out.println(sDTM.toString());
        } catch(ValidityException ve) {
            System.err.println("Error: " + ve.getMessage());
        }
        System.out.println(sNAD.getDescription() + "\n" + sNAD.getLongDescription());
        sNAD.e3035.setContent("BY");
        sNAD.eC082.e3039.setContent("003701234567");
        sNAD.eC082.e3055.setContent("92");
        sNAD.eC080.e3036_1.setContent("CGI");
        sNAD.eC080.e3036_2.setContent("Ilkka Mannelin");
        sNAD.eC059.e3042_1.setContent("Karvaamokuja 2");
        sNAD.e3164.setContent("Helsinki");
        sNAD.e3207.setContent("FI");
        sNAD.e3251.setContent("00380");
        try {
            sNAD.validate();
            System.err.println("NAD-segmentti: " + sNAD);
        } catch (ValidityException ex) {
            System.err.println("Error: " + ex.getMessage());
            //Logger.getLogger(EDIframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param inputStr
     * @return
     */
    public String identify(String inputStr) {
        String[] segments;
        boolean isUNA = false;
        String response = "UNKNOWN";
        
        if (inputStr.length() > 0) {
            if (inputStr.startsWith("'''ED2'''")) {
                response = "OVT";
            } else {
                segments = inputStr.split("'");
                for (String segment : segments) {
                    if (segment.startsWith("UNA")) {
                        response = "UNA";
                        //return "UNA";
                    } else {
                        if (segment.startsWith("UNB")) {
                            if (response.equalsIgnoreCase("UNA")) {
                                return("UNAUNB");
                            }
                            response = "UNB";
                        }
                    }
                }
            }
        }
        return response;
    }
    
     private static void printHTMLheader() {
        System.out.println("<!doctype html public \"-//W3C//DTD HTML 3.2 Final//EN\">");
        System.out.println("<html>");
        System.out.println("<head><title>EDI-frame info</title>");
        System.out.println("<style>");
        System.out.println("table, th, td {");
        System.out.println("    border: 1px solid black;");
        System.out.println("    border-collapse: collapse;");
        System.out.println("}");
        System.out.println("</style>");
        System.out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />");
        System.out.println("</head>");
        System.out.println("<body>");
    }
    
    private static void printHTMLtail() {
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
