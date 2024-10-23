import es.urjc.grafo.ABII.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void test() {
        double score = Main.experiment("src/main/resources/instances/instance1.txt");
        Assertions.assertTrue(score >= 0.0);
    }
}
