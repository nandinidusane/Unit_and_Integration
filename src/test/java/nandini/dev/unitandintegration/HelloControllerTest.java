package nandini.dev.unitandintegration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import nandini.dev.unitandintegration.controllers.HelloController;

public class HelloControllerTest {
	@Test
    void hello() {
        HelloController controller = new HelloController(); // Arrange
        String response = controller.hello("World"); // Act
        assertEquals("Hello, World", response);// Assert
    }

}
