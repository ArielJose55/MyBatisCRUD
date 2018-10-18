/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demomybatis.logica.dao;

import demomybatis.logica.Persona;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Estudiante
 */
public class PersonaDAO {
    
    private SqlSessionFactory sqlSessionFactory = null;
 
    public PersonaDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
    public boolean insertar(Persona persona){
       int id = -1;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            id = session.insert("Persona.insert", persona);
            session.commit();
        }  
        return id != -1;
    }
}
