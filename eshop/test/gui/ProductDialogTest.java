/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProductDAO;
import java.util.Collection;
import java.util.TreeSet;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.ArgumentCaptor;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author lixi3350
 */
public class ProductDialogTest {
    
        private ProductDAO dao;
	private DialogFixture fixture;
	private Robot robot;
        
    public ProductDialogTest() {
    }
    
    
    @Before
    public void setUp() {
        robot = BasicRobot.robotWithNewAwtHierarchy();
		
		// slow down the robot a bit - default is 30
		robot.settings().delayBetweenEvents(75);		
		
		// add some majors for testing with
		Collection<String> category = new TreeSet<>();
		category.add("Knitting");
		category.add("Ninjitsu");

		// create a mock for the DAO
		dao = mock(ProductDAO.class);

		// stub the getMajors method to return the test majors
		when(dao.getCategories()).thenReturn(category);
	}
    }
    
    @After
    public void tearDown() {
            // clean up fixture so that it is ready for the next test
		fixture.cleanUp();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testSave() {
		// create the dialog passing in the mocked DAO
		Editor dialog = new Editor(null, true, dao);

		// use AssertJ to control the dialog
		fixture = new DialogFixture(robot, dialog);
		fixture.show().requireVisible();

		// enter some details into the UI components
		fixture.textBox("txtId").enterText("11");
		fixture.textBox("txtName").enterText("Name11");
                fixture.textBox("txtDescription").enterText("description11");
                fixture.textBox("txtPrice").enterText("11");
		fixture.comboBox("cmbCategory").selectItem("Knitting");
                fixture.textBox("txtQuantity").enterText("11");
		// click the save button
		fixture.button("Save").click();

		// create a Mockito argument captor to use to retrieve the passed student from the mocked DAO
		ArgumentCaptor<Student> argument = ArgumentCaptor.forClass(Student.class);

		// verify that the DAO.save method was called, and capture the passed student
		verify(dao).save(argument.capture());

		// retrieve the passed student from the captor
		Product savedProd = argument.getValue();

		// test that the student's details were properly saved
                assertEquals("Ensure the ID was saved", new Integer(11), savedProd.getId());
		assertEquals("Ensure the name was saved", "Name11", savedProd.getName());
		assertEquals("Ensure the category was saved", "Knitting", savedProd.getcateory());
	}
}
}
