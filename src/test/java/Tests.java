import es.urjc.grafo.ABII.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testInstance1() {
        double score = Main.experiment("src/main/resources/instances/instance1.txt");
        System.out.println(score);
        Assertions.assertTrue(score >= 0.0);
    }

    @Test
    public void testInstance2() {
        double score = Main.experiment("src/main/resources/instances/instance2.txt");
        System.out.println(score);
        Assertions.assertTrue(score >= 0.0);
    }
}
