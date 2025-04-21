package estruturas_condicionais;

public class switchCase {
    public static void main(String[] args) {
       
       String plano = "";

       if (plano == "Básico") {
        System.out.println("100 minutos de ligação");
       }
       else if (plano == "Médio") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whatszapp e Instagram grátis");
       }
       else if (plano == "Turbo") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whatszapp e Instagram grátis");
        System.out.println("5GB YouTube");
       }
     
      //Exemplo com SwitchCase
      String plano2 = "Turbo";

      switch (plano2) {
        case "Turbo":{
            System.out.println("5GB YouTube");
        }
        case "Médio":{
            System.out.println("Whatszapp e Instagram grátis");
        }
        case "Básico":{
            System.out.println("100 minutos de ligação");
        }
      }

    }
}
