package main;

import java.util.Calendar;
import java.util.Date;

import credCobGerClasses.TipoUsuario;
import credCobGerClasses.Usuario;
import credCobGerServices.TipoUsuarioService;
import credCobGerServices.UsuarioService;

public class PruebaDB {

	public static void main(String[] args) {

		/* Se tratará de ejemplificar el uso de la herramienta hibernate a nivel de clases y objetos
		 * 
		 * Primero, veremos lo que es un servicio... Un servicio me permite obtener una tabla 
		 * por vez, ejemplo:
		 */
		
		TipoUsuarioService TUS = new TipoUsuarioService();
		
		/* El servicio, me permitirá tener el estado de la base de datos en cualquier momento, siempre
		 * y cuando, yo coloque la función correcta...
		 * 
		 * Haremos el insert a una tabla, siempre siguiendo el ejemplo; cuando queremos ingresar un
		 * nuevo registro, lo haremos por objetos:
		 */
		
		TipoUsuario tipo1 = new TipoUsuario();
		TipoUsuario tipo2 = new TipoUsuario();
		TipoUsuario tipo3 = new TipoUsuario();
		
		/*
		 * hay que llenar los "Objeto-Registro" de forma adecuada... por lo general, la base de datos
		 * no acepta null en sus campos, así que hay que llenar todos los datos del tipo de usuario: 
		 */
		
		tipo1.setCodUsu(1);
		tipo1.setTipUsu("Admin");
		tipo2.setCodUsu(2);
		tipo2.setTipUsu("Gerente");
		tipo3.setCodUsu(3);
		tipo3.setTipUsu("CredCob");
		
		/* Una vez llenos nuestros "Objetos-Registros", procedemos a ingresarlos a la base, esta es la
		 * utilidad del servicio... El servicio me permite utilizar las funciones básicas de insert,
		 * update y delete para los registros de una tabla...
		 */
		
		TUS.save(tipo1);
		TUS.save(tipo2);
		TUS.save(tipo3);
		
		/* 
		 * Los registros han sido almacenados en la Base, revisarla usando el Control Center.
		 * 
		 * Ahora, una inserción más compleja... Ingresaremos un Usuario dentro de la base...
		 * 
		 * 1° Servicios necesarios (corresponden con las tablas y sus llaves primarias, 
		 * cuando son compuestas, o cuando necesitan el uso de llaves compuestas (sean foráneas o 
		 * principales)...
		 * 
		 */
		
		TUS = new TipoUsuarioService(); //no es necesario en este punto, pero solo por ejemplificar...
		UsuarioService US = new UsuarioService();
		
		Date fecha = Calendar.getInstance().getTime();
		
		
		TipoUsuario tipo = TUS.get(1);
		Usuario usu = new Usuario("Jos", 6, "0000001", "jnkielase", fecha);
		US.save(usu);
		// Dudas... revisar el constructor de Usuario... esta es otra forma de llenar nuestros
		// Objetos-Registros (nombre vulgar, no es ley)
		// tipo.getCodUsu() --> forma de obtener el código de tipo de usuario a partir de un 
		// O-R de la base...
		
		/*
		 * Antes de ingresar datos a la BD, hay que verificar el cumplimiento de las llaves foráneas
		 * porque el MySQL en esa versión no lo comprueba... por eso se pudo meter ese registro
		 * 
		 * Cod_usu en usuario, se refiere al tipo de usuario dentro del sistema...
		 * 
		 * Usar las funciones Update y Remove, se las dejo a su imaginación, cualquier pregunta me la hacen...
		 */
		
		
		
		
	}

}
