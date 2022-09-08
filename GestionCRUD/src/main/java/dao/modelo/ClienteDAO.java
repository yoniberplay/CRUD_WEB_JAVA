package dao.modelo;

import java.util.List;

import dao.modelo.cliente;

public interface ClienteDAO {
	
	public List<cliente> getcClientes();

	public void insetarcliente(cliente cl);

	public void updatecliente(cliente cl);

	public cliente getcliente(int id);

	public void deletecliente(int id);

	public boolean validateloggin(String usuario, String clave);

}
