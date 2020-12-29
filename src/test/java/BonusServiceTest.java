import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateUnregisteredAndUnderlimit() {
        BonusService service = new BonusService();
        long amount=2550;
        boolean registered=false;
        long expected=0;
        long actual= service.calculate(amount, registered);
        assertEquals(expected,actual);

    }
    @Test
    void shouldCalculateUnregisteredAndOverlimit() {
        BonusService service = new BonusService();
        long amount=58_587_587;
        boolean registered=false;
        long expected=500;
        long actual= service.calculate(amount,registered);
        assertEquals(expected,actual);

    }
}
