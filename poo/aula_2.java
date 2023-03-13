public class aula_2 {
    public static void main(String[] args) {
        
        caneta c1 = new caneta();

        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.modelo = "bic cristal";
       
        c1.tampar();
        c1.status();
        c1.rabiscar();


    }
    
}
