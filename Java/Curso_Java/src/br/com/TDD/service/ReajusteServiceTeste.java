package br.com.TDD.service;

import br.com.TDD.modelo.Desempenho;
import br.com.TDD.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTeste {

    @Test
    public void AjusteDeveriaSerDeTresPorcento()
    {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.reajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }@Test
    public void AjusteDeveriaSerDeQuinzePorcento()
    {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.reajuste(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }@Test
    public void AjusteDeveriaSerDeVintePorcento()
    {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.reajuste(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
