package demomybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import demomybatis.logica.Persona;
import demomybatis.logica.dao.MyBatisSqlSessionFactory;
import demomybatis.logica.dao.PersonaDAO;

public class PersonaDaoTest {

	@ParameterizedTest(name = "{0} y {1}")
	@CsvSource({
		"12345, Renito",
		"34565, Renita"
	})
	void insert(int cedula, String nombre) {
		PersonaDAO dao = new PersonaDAO(MyBatisSqlSessionFactory.getSqlSessionFactory());
		assertEquals(Boolean.TRUE, dao.insertar(new Persona(cedula, nombre)), ()-> "Inserto satisfactorio");
	}
}
