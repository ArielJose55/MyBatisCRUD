/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demomybatis;

import demomybatis.logica.Persona;
import demomybatis.logica.dao.MyBatisSqlSessionFactory;
import demomybatis.logica.dao.PersonaDAO;

/**
 *
 * @author Estudiante
 */
public class DemoMyBatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona(1234, "Juanito");
       
        PersonaDAO dao = new PersonaDAO(MyBatisSqlSessionFactory.getSqlSessionFactory());
        dao.insertar(persona);
    }
    
}
