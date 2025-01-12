import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import pb2.PerecheNumere;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TPerecheNumere {

    @Nested
    class T_consecutiveFibonacci {

        @Test
        void test1_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(4,16);
            assertFalse(p.Fibonacci(0, 1));
        }

        @Test
        void test2_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(3, 5);
            assertTrue(p.Fibonacci(0, 1) );
        }

        @Test
        void test3_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(8, 24);
            assertFalse(p.Fibonacci(0, 1) );
        }
    }

    @Nested
    class T_cmmmc {

        @Test
        void test1_cmmmc() {
            PerecheNumere p = new PerecheNumere(2, 5);
            assertEquals(10, p.cmmmc());
        }

        @Test
        void test2_cmmmc() {
            PerecheNumere p = new PerecheNumere(10, 14);
            assertEquals(70, p.cmmmc());
        }

        @Test
        void test3_cmmmc() {
            PerecheNumere p = new PerecheNumere(11, 3);
            assertFalse(p.cmmmc() != 33);
        }
    }

    @Nested
    class T_sumaCifrelorEgala {

        @Test
        void test1_sumaCifrelorEgala() {
            PerecheNumere p = new PerecheNumere(62, 152);
            assertTrue(p.sumaCifrelorEgala());
        }

        @Test
        void test2_sumaCifrelorEgala() {
            PerecheNumere p = new PerecheNumere(140, 89);
            assertFalse(p.sumaCifrelorEgala());
        }

        @Test
        void test3_sumaCifrelorEgala() {
            PerecheNumere p = new PerecheNumere(12, 30);
            assertTrue(p.sumaCifrelorEgala());
        }
    }

    @Nested
    class T_acelasiNrCifrePare {

        @Test
        void test1_acelasiNrCifrePare() {
            PerecheNumere p = new PerecheNumere(146, 3579);
            assertFalse(p.acelasiNrCifrePare());
        }

        @Test
        void test2_acelasiNrCifrePare() {
            PerecheNumere p = new PerecheNumere(2004, 2468);
            assertTrue(p.acelasiNrCifrePare());
        }

        @Test
        void test3_acelasiNrCifrePare() {
            PerecheNumere p = new PerecheNumere(89, 61);
            assertTrue(p.acelasiNrCifrePare());
        }
    }
}