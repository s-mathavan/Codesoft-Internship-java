package pack;

public class ClearScreen {
    public void cls() {
        //System.out.println("Notu");
        try {
            String os = System.getProperty("os.name").toLowerCase();
            //System.out.println("Operating System: " + os);
            ProcessBuilder processBuilder=null;
            if (os.contains("win")) {
                // For Windows
                processBuilder = new ProcessBuilder("C:\\Windows\\System32\\cmd.exe", "/c", "cls");
            } else {
                // For Unix-like systems (Linux, macOS)
                processBuilder = new ProcessBuilder("clear");
            }

            processBuilder.inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Your program continues from here
        //System.out.println("This is the cleared screen.");
    }
}
