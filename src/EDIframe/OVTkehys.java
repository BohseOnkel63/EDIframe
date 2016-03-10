/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIframe;

/**
 *
 * @author mannelini
 */
public class OVTkehys {
    private String OVTstring;
    private String OVT_VAST_VERKKO;
    private String OVT_VAST_TUNNUS;
    private String OVT_VAST_ORG;
    private String OVT_LHTT_VERKKO;
    private String OVT_LHTT_TUNNUS;
    private String OVT_LHTT_ORG;
    private String OVT_KULJETUSTUNNUS;
    private String OVT_PALANRO;
    private String OVT_TYP;
    private String OVT_STX;
    private String OVT_NRQ;
    
    /**
     *
     * @return
     */
    public String getOVTstring() {
        return OVTstring;
    }

    /**
     *
     * @param OVTstring
     */
    public void setOVTstring(String OVTstring) {
        this.OVTstring = OVTstring;
    }

    /**
     *
     * @return
     */
    public String getOVT_VAST_VERKKO() {
        return OVT_VAST_VERKKO;
    }

    /**
     *
     * @param OVT_VAST_VERKKO
     */
    public void setOVT_VAST_VERKKO(String OVT_VAST_VERKKO) {
        this.OVT_VAST_VERKKO = OVT_VAST_VERKKO;
    }

    /**
     *
     * @return
     */
    public String getOVT_VAST_TUNNUS() {
        return OVT_VAST_TUNNUS;
    }

    /**
     *
     * @param OVT_VAST_TUNNUS
     */
    public void setOVT_VAST_TUNNUS(String OVT_VAST_TUNNUS) {
        this.OVT_VAST_TUNNUS = OVT_VAST_TUNNUS;
    }

    /**
     *
     * @return
     */
    public String getOVT_VAST_ORG() {
        return OVT_VAST_ORG;
    }

    /**
     *
     * @param OVT_VAST_ORG
     */
    public void setOVT_VAST_ORG(String OVT_VAST_ORG) {
        this.OVT_VAST_ORG = OVT_VAST_ORG;
    }

    /**
     *
     * @return
     */
    public String getOVT_LHTT_VERKKO() {
        return OVT_LHTT_VERKKO;
    }

    /**
     *
     * @param OVT_LHTT_VERKKO
     */
    public void setOVT_LHTT_VERKKO(String OVT_LHTT_VERKKO) {
        this.OVT_LHTT_VERKKO = OVT_LHTT_VERKKO;
    }

    /**
     *
     * @return
     */
    public String getOVT_LHTT_TUNNUS() {
        return OVT_LHTT_TUNNUS;
    }

    /**
     *
     * @param OVT_LHTT_TUNNUS
     */
    public void setOVT_LHTT_TUNNUS(String OVT_LHTT_TUNNUS) {
        this.OVT_LHTT_TUNNUS = OVT_LHTT_TUNNUS;
    }

    /**
     *
     * @return
     */
    public String getOVT_LHTT_ORG() {
        return OVT_LHTT_ORG;
    }

    /**
     *
     * @param OVT_LHTT_ORG
     */
    public void setOVT_LHTT_ORG(String OVT_LHTT_ORG) {
        this.OVT_LHTT_ORG = OVT_LHTT_ORG;
    }

    /**
     *
     * @return
     */
    public String getOVT_KULJETUSTUNNUS() {
        return OVT_KULJETUSTUNNUS;
    }

    /**
     *
     * @param OVT_KULJETUSTUNNUS
     */
    public void setOVT_KULJETUSTUNNUS(String OVT_KULJETUSTUNNUS) {
        this.OVT_KULJETUSTUNNUS = OVT_KULJETUSTUNNUS;
    }

    /**
     *
     * @return
     */
    public String getOVT_PALANRO() {
        return OVT_PALANRO;
    }

    /**
     *
     * @param OVT_PALANRO
     */
    public void setOVT_PALANRO(String OVT_PALANRO) {
        this.OVT_PALANRO = OVT_PALANRO;
    }

    /**
     *
     * @return
     */
    public String getOVT_TYP() {
        return OVT_TYP;
    }

    /**
     *
     * @param OVT_TYP
     */
    public void setOVT_TYP(String OVT_TYP) {
        this.OVT_TYP = OVT_TYP;
    }

    /**
     *
     * @return
     */
    public String getOVT_STX() {
        return OVT_STX;
    }

    /**
     *
     * @param OVT_STX
     */
    public void setOVT_STX(String OVT_STX) {
        this.OVT_STX = OVT_STX;
    }

    /**
     *
     * @return
     */
    public String getOVT_NRQ() {
        return OVT_NRQ;
    }

    /**
     *
     * @param OVT_NRQ
     */
    public void setOVT_NRQ(String OVT_NRQ) {
        this.OVT_NRQ = OVT_NRQ;
    }

    /**
     *
     * @param OVTstring
     */
    public OVTkehys(String OVTstring) {
        this.OVTstring = OVTstring;
    }
    
    /**
     *
     * @throws OVTexception
     */
    public void print() throws OVTexception {

        this.parse(this.OVTstring);
        
        System.out.println("OVT-kuljetuskehys");
        System.out.println("  " + this.OVTstring + "\n");
        System.out.println("Vastaanottajan");
        System.out.println("  verkko:             " + OVT_VAST_VERKKO);
        System.out.println("  tunnus:             " + OVT_VAST_TUNNUS);
        System.out.println("  organisaatio:       " + OVT_VAST_ORG);
        System.out.println("Lähettäjän");
        System.out.println("  verkko:             " + OVT_LHTT_VERKKO);
        System.out.println("  tunnus:             " + OVT_LHTT_TUNNUS);
        System.out.println("  organisaatio:       " + OVT_LHTT_ORG);
        System.out.println("Kuljetustunnus:       " + OVT_KULJETUSTUNNUS);
        System.out.println("Pala nro:             " + OVT_PALANRO);
        if (OVT_STX != null)
            System.out.println("Syntaksi (STX):       " + OVT_STX);
        if (OVT_TYP != null)
            System.out.println("Tyyppi (TYP):         " + OVT_TYP);
        if (OVT_NRQ != null)
            System.out.println("Kuittauspyyntö (NRQ): " + OVT_NRQ);
        System.out.println("\n");
    }
    
    /**
     *
     * @param OVTstring
     * @throws OVTexception
     */
    public void print(String OVTstring) throws OVTexception {
        this.setOVTstring(OVTstring);
        this.print();
    }
    
    /**
     *
     * @throws OVTexception
     */
    public void printHTML() throws OVTexception {
        
    }
    
    /**
     *
     * @param OVTstring
     * @throws OVTexception
     */
    public void printHTML(String OVTstring) throws OVTexception {
        this.setOVTstring(OVTstring);
        this.printHTML();
    }

    /**
     *
     * @return
     * @throws OVTexception
     */
    public String getText() throws OVTexception {
        String Response = "";

        this.parse(this.OVTstring);
        
        Response = "OVT-kuljetuskehys\n";
        Response = Response + "\t" + this.OVTstring + "\n";
        Response = Response + "Vastaanottajan\n  verkko:             " + OVT_VAST_VERKKO + "\n";
        Response = Response + "  tunnus:             " + OVT_VAST_TUNNUS + "\n  organisaatio:       " + OVT_VAST_ORG + "\n";
        Response = Response + "Lähettäjän\n  verkko:             " + OVT_LHTT_VERKKO + "\n";
        Response = Response + "  tunnus:             " + OVT_LHTT_TUNNUS + "\n";
        Response = Response + "  organisaatio:       " + OVT_LHTT_ORG + "\n";
        Response = Response + "Kuljetustunnus:       " + OVT_KULJETUSTUNNUS + "\n";
        Response = Response + "Pala nro:             " + OVT_PALANRO + "\n";
        if (OVT_STX != null)
            Response = Response + "Syntaksi (STX):       " + OVT_STX + "\n";
        if (OVT_TYP != null)
            Response = Response + "Tyyppi (TYP):         " + OVT_TYP + "\n";
        if (OVT_NRQ != null)
            Response = Response + "Kuittauspyyntö (NRQ): " + OVT_NRQ + "\n\n";
        
        return Response;
    }

    
    
    
    private void parse(String OVTstring) throws OVTexception {
        int i;
        String[] segments;
        String[] elements;
        String[] lahettaja;
        String[] vastaanottaja;
        
        if (OVTstring.startsWith("'''ED2'''")) {
        } else {
            throw new OVTexception("OVT-kehys ei ala merkkijonolla '''ED2'''");
        }
        segments = OVTstring.substring(9).split("'");
        if (segments.length < 4) {
            throw new OVTexception("OVT-kehyksellä on liian vähän elementtejä.");
        }
        for (i = 0; i < segments.length; i++) {
            switch (i) {
            case 0 :
                elements = segments[i].split(":");
                this.setOVT_LHTT_ORG(elements[0]);
                this.setOVT_LHTT_TUNNUS(elements[1]);
                this.setOVT_LHTT_VERKKO(elements[2]);
                break;
            case 1 :
                elements = segments[i].split(":");
                this.setOVT_VAST_ORG(elements[0]);
                this.setOVT_VAST_TUNNUS(elements[1]);
                this.setOVT_VAST_VERKKO(elements[2]);
                break;
            case 2 :
                this.setOVT_KULJETUSTUNNUS(segments[i]);
                break;
            case 3 :
                this.setOVT_PALANRO(segments[3]);
                break;
            default : 
                elements = segments[i].split(":");
                if ("TYP".equals(elements[0])) this.setOVT_TYP(elements[1]);
                if ("NRQ".equals(elements[0])) this.setOVT_NRQ(elements[1]);
                if ("STX".equals(elements[0])) this.setOVT_STX(elements[1]);
            }
        }
    }
}
