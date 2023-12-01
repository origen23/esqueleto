package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {

		//atributos

	    Long id;
		String nombre;
		String apellido;
		String mail;
		String tema;
		LocalDate fechaAlta;

		//constructor/es
		//usar cuando voy a enviar un objeto a la db
		//insert into orador (campos,..) values(...)

		public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			init(nombre, apellido, mail, tema, fechaAlta);
		}

		public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			this.id = id;
			init(nombre, apellido, mail, tema, fechaAlta);
		}
		
		public void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.mail = mail;
			this.tema = tema;
			this.fechaAlta = fechaAlta;
		}


}
