public class caneta03 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Caneta modelo " + this.modelo);
        System.out.println("Caneta " + this.cor);
        System.out.println("Caneta ponta " + this.ponta);
        System.out.println("Caneta com " + this.carga +"% de carga");
        System.out.println("A caneta esta tampada " + this.tampada);

    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar tampada");
        }
        else{
            System.out.println("Estou rabiscando");
        }

    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;

    }
}
    

