package update_faker_module.Helpers;

import java.io.File;
import java.io.IOException;

public class SimpleProcess {

    public static int run(String... command) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder(command);
        pb.inheritIO(); // In thẳng ra console
        Process p  = pb.start();
        return p.waitFor();
    }
}
