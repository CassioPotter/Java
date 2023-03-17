public class caneta04 {
    public String modelo;
    public String cor;
    public float ponta;
    
    public String getModelo() {
        return this.modelo;
    }
   
    public void setModelo( String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void status() {
        System.out.println("A caneta é do modelo " + this.modelo);
        System.out.println("A ponta é "+ this.ponta);
    }
}
