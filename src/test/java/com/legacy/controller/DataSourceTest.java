package com.legacy.controller;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/config/**/*.xml"})
public class DataSourceTest {
	@Inject
    private DataSource ds;
	

    @Test
    public void testconnection() throws Exception{
        try(Connection con = ds.getConnection()) { // try() { TODO } catch (Exception e) { TODO} 형태를 try -with구문이라하며 자동으로 Connection 객체가 clse()될 수 있도록 작성 한 것이다.
            System.out.println("test");
            System.out.println("connection 객체출력 : " + con);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}
