package br.edu.fatecmm.projetoenum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
	    Gerente gerente = new Gerente(1,"Jose", "josi@gmail.com",
                "987.954.244-15", "goiaba", "123");
        Secretaria secretaria = new Secretaria(2, "Rosimelril", "rosi@gmail.com",
                "15487-126", "(19)97777-5555", "001");
        Operador operador = new Operador(3, "Pedrão", "pedra@gmail.com", "455547896214520", 5.45);

        RegistroPonto rp = new RegistroPonto(123345, gerente, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(rp.toString());
        Thread.sleep(5000);

        RegistroPonto rp2 = new RegistroPonto(98908, secretaria, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(rp2.toString());
        Thread.sleep(5000);

        RegistroPonto rp3 = new RegistroPonto(98774, operador, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(rp3.toString());
        Thread.sleep(5000);

        rp.setHoraSaida(LocalDateTime.now());
        System.out.println(rp.toString());
        Thread.sleep(3999);

        rp2.setHoraSaida(LocalDateTime.now());
        System.out.println(rp2.toString());
        Thread.sleep(2993);

        rp3.setHoraSaida(LocalDateTime.now());
        System.out.println(rp3.toString());
    }
}