package dao;

public class DaoImpl implements IDao{
	@Override
	public double getData() {
		System.out.println("version base de données");
		double data=80;
		return data;
		}
}
