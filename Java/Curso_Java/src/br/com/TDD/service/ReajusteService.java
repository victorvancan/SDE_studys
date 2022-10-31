package br.com.TDD.service;

import br.com.TDD.modelo.Desempenho;
import br.com.TDD.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {


    public void reajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentualReajuste = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentualReajuste);
            funcionario.reajustarSalario(reajuste);


    }
}
