import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;

import org.junit.Test;

public class DocSearchTest {
    @Test(expected = IOException.class)
    public void testHandler(){
        URI testURI = URI.create("oijoij");
        Handler tandler = new Handler("/Users/Xavier Ramirez/Documents/GitHub/docsearch");
        assertEquals("Don't know how to handle that path!", tandler.handleRequest(testURI));
    }
}
