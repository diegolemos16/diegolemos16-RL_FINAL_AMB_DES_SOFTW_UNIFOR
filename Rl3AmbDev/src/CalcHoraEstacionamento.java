public class CalcHoraEstacionamento {
    
    
    public static void main(String[] args) {
        
        double valorHora=5.5;
        double horaInicial=13.00;
        double horaFinal=15.50;
        double horaTotal;
        double valorFinal;

        horaTotal =Calculadora.Piso( horaFinal-horaInicial);
        valorFinal = horaTotal*valorHora;
         
        System.out.println("O total de horas foi: "+horaTotal+" e o valor a pagar é: "+ valorFinal);
    }


}
