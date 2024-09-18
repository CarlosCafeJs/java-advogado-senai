package validations;

public class ClearConsole {
  public static void limpar() {
      try {
          if (System.getProperty("os.name").contains("Windows")) {
              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          } else {
              new ProcessBuilder("clear").inheritIO().start().waitFor();
          }
      } catch (Exception e) {
          System.out.println("Erro ao limpar o console: " + e.getMessage());
      }
  }
}

