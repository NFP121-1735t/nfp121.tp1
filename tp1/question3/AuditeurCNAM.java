package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String n = this.nom;
        String p = this.prenom;
       
        if(n.length()>6){ // recuperer la nom qui a 6 ou plus lettres
            n=n.substring(0,6);//enlever le 6 premiers lettres du nom
        }
        n=n.replaceAll(" " , "_");
        n=n.replaceAll("-","_");
        p=p.substring(0,1); // enlever la premier lettre du prenom
        

    String fini ;
    fini= n+ "_" +p; // camcatenation du 6 lettres avec la lettre du prenom
     
        fini=fini.replaceAll("[�,�,�]" , "e");//remplacer l'accent par une 'e' sans accent
        fini=fini.replaceAll("[�,�,�]" , "i");//remplace l"i" accent par une "i" sans accent
        fini=fini.replaceAll("[�,�]" , "c");//remplacer le "C" cedille par une "C" sans cedille
        fini=fini.replaceAll("[�,�,�,�]" , "a");//remplacer l"a" accent par une"A" sans accent
        fini=fini.toLowerCase(); // transformer la username en miniscule 
   
        return fini;// rendre la final resultat
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
      
        String nomAuditeur=this.nom; 
        
        return nomAuditeur;// � compl�ter
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        String prenomAuditeur=this.prenom;
        return prenomAuditeur;
        // � compl�ter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        String matriculeAuditeur=this.matricule;

        return matriculeAuditeur;// � compl�ter
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
