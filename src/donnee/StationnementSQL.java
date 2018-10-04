package donnee;

public interface StationnementSQL 
{
	public static final String SQL_LISTER_STATIONNEMENT = "SELECT * FROM stationnement";
	public static final String SQL_AJOUTER_STATIONNEMENT  = "INSERT into stationnement(nom, nombre_place, nombre_etage, ville) VALUES(?,?,?,?)";
	public static final String SQL_MODIFIER_STATIONNEMENT  = "UPDATE stationnement SET nom = ?, nombre_place = ?, nombre_etage = ?, ville = ? WHERE id_stationnement = ?";
	public static final String SQL_RAPPORTER_STATIONNEMENT  = "SELECT * FROM stationnement WHERE id_stationnement = ?";
}
