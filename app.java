package update_faker_module;

import update_faker_module.Helpers.SimpleProcess;

public class App {
    
    public static void main(String[] args)  {

        int tick_count = 0;

        while(true){

            System.out.println("[INFO] APP RUNNING..." + tick_count);
            
            try {
                
                tick_count++;
                Thread.sleep(1000);
                if (tick_count == 10) {
                    try {
                        App.staging("https://github.com/tungttsmd/simple-process.git");
                    } catch (Exception e) {
                        System.out.println("[INFO] CRASHED...");
                        e.printStackTrace();
                        return;
                    }
                }

            } catch (InterruptedException e) {
                System.out.println("[ERROR] APP CRASHED AT " + tick_count);
                e.printStackTrace();
                break;
            }
        }
    }

    public static void staging(String repo) throws Exception {

        System.out.println("[INFO] SPAWN UPDATER...");

        new ProcessBuilder(
                "cmd",
                "/c",
                "start",
                "cmd",
                "/k",
                "java", "update.java", repo
        ).start();

        System.exit(99);
    }
}