package dao.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "cliente")
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull(message = "*")
	@Column(name = "nombre")
	private String nombre;
	
	@NotNull(message = "*")
	@Column(name = "apellido")
	private String apellido;
	
	@NotNull(message = "*")
	@Email(message = "Email incorrecto")
	@Column(name = "email")
	private String email;
	
	@prefijo
	@Size(min = 10, max = 10, message= "*")
	@Pattern(regexp = "^[0-9]*$",message = "*")
	@Column(name = "telefono")
	private String telefono;
	
	@NotNull(message = "*")
	@Column(name = "sexo")
	private String sexo;
	
	public cliente() {}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono="
				+ telefono + ", sexo=" + sexo + "]";
	}

	
	

}
