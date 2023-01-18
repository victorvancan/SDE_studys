//package br.com.TDD.service;
//
//import br.com.TDD.service.BonusService;
//import br.com.TDD.modelo.Funcionario;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BonusServiceTest {
//
//    @Test
//    void bonusDeveriaSerZeroQuandoMaiorQueMil()
//    {
//        BonusService service = new BonusService();
//        BigDecimal bonus = service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("25000.00")));
//
//        assertEquals(BigDecimal.ZERO, bonus);
//    }
//    @Test
//    void bonusDeveriaSerDezPorCentoDoSalario()
//    {
//        BonusService service = new BonusService();
//        BigDecimal bonus = service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("1000.00")));
//
//        assertEquals(new BigDecimal("100.0"), bonus);
//    }
//    @Test
//    void bonus()
//    {
//        BonusService service = new BonusService();
//        BigDecimal bonus = service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("10000.00")));
//
//        assertEquals(new BigDecimal("1000.0"), bonus);
//    }
//
//}
