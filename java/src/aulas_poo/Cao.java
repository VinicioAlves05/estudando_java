package aulas_poo;

public class Cao {
        Double altura, peso;
        static String comida;
    
        public Double getAltura() { return this.altura; }
        public Double getPeso() { return this.peso;  }
        public String getComida() { return this.comida; }
    
        public void setAltura (Double _altura) {this.altura = _altura;}
        public void setPeso (Double _peso) {this.peso = _peso;}
        public void setComida (String _comida) {this.comida = _comida;}
    
        public void Correr(){
            System.out.println("Método correr");
            System.out.println("Altura: " + this.getAltura());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("Comida: " + this.getComida());
        }
        
        public void Latir(){
            System.out.println("Latindo....");
        }

        public static void Morder(){   //Quando o método está no Static, ele pertence somente a classe, ele deixa de ser um objeto.
            System.out.println("Mordendo....");  
        }
    }
    

