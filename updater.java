package update_faker_module;

import java.io.File;
import update_faker_module.Helpers.SimpleProcess;

public class Updater {
    
    public static void main(String[] args) {

        int exitcode = Updater.stagging(args[0]);

        if (exitcode != 0) {
            System.out.println("[ERROR] FAILED TO STAGGING...");
            return;
        }
        
        // rename staging -> current
        // start app
    }

    private static int stagging(String repo) {
        
        return SimpleProcess.run("git", "clone", repo, "staging");
        
    }
}