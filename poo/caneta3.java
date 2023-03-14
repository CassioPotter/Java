public public class caneta3 {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Caneta modelo " + this.modelo);
        System.out.println("Caneta " + this.cor);
        System.out.println("Caneta ponta " + this.ponta);
        System.out.println("Caneta com " + this.carga +"% de carga");
        System.out.println("A caneta esta tampada " + this.tampada);

    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar tampada");
        }
        else{
            System.out.println("Estou rabiscando");
        }

    }
    void tampar (){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;

    }
}