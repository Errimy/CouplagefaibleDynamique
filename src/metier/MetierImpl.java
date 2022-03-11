package metier; import dao.IDao;

public class MetierImpl implements IMetier {
/*Couplage faible*/
	
private IDao dao;
@Override
public double calcul() {
	
double t=dao.getData(); double res=t*66;
return res;
}
/* Setter pour injection des dépendances*/
public void setDao(IDao dao) { this.dao = dao; }
}
