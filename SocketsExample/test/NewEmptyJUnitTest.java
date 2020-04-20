/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import socketsexample.EchoClient;
import socketsexample.GreetClient;

/**
 *
 * @author Usuario
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    }

    //GreenServer
//    @Test
//    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
//        GreetClient client = new GreetClient();
//        client.startConnection("127.0.0.1", 6666);
//        String response = client.sendMessage("hello server");
//        assertEquals("hello client", response);
//    }
    
    
    //EchoServer
//    @Test
//    public void givenClient1_whenServerResponds_thenCorrect() {
//        EchoClient client1 = new EchoClient();
//        client1.startConnection("127.0.0.1", 4444);
//        String msg1 = client1.sendMessage("hello");
//        String msg2 = client1.sendMessage("world");
//        String terminate = client1.sendMessage(".");
//
//        assertEquals(msg1, "hello");
//        assertEquals(msg2, "world");
//        assertEquals(terminate, "good bye");
//    }
    
    
    //Multiserver
     @Test
    public void givenClient1_whenServerResponds_thenCorrect() {
        EchoClient client1 = new EchoClient();
        client1.startConnection("127.0.0.1", 5555);
        String msg1 = client1.sendMessage("hello");
        String msg2 = client1.sendMessage("world");
        String terminate = client1.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() {
        EchoClient client2 = new EchoClient();
        client2.startConnection("127.0.0.1", 5555);
        String msg1 = client2.sendMessage("hello");
        String msg2 = client2.sendMessage("world");
        String terminate = client2.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }
}
