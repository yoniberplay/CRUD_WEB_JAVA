package dao.modelo;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "loggin")
public class loggin_entity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull(message = "*")
	@Column(name = "usuario")
	private String usuario;
	
	@NotNull(message = "*")
	@Column(name = "clave")
	private String clave;
	

	public loggin_entity() {
	}

	@Override
	public String toString() {
		return "loggin_entity [id=" + id + ", usuario=" + usuario + ", clave=" + clave + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	

}
