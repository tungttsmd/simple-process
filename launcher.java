package update_faker_module;

import update_faker_module.Helpers.SimpleProcess;

public class Launcher {
    
    public static void main(String[] args) {

        try {

            int exitcode = 0;

            System.out.println("[INFO] ĐANG KHỞI ĐỘNG APP...");
            
            exitcode = SimpleProcess.run("java", "app.java");
            
            if (exitcode == 0) {

                System.out.println("[INFO] APP IS CRASHED (EXIT CODE = 0)...");
                return;
            } // Thoát hẳn

        } catch (Exception e) {
            System.out.println("[ERRO] UNKNOWN CRASHED...");
            e.printStackTrace();
        }
    }
}