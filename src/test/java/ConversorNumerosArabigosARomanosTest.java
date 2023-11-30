import org.example.ConversorNumerosArabigosARomanos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class ConversorNumerosArabigosARomanosTest {

    @Test
    void convertirNumeroArabigoARomano(){
//        arrange
        ConversorNumerosArabigosARomanos conversorNumerosArabigosARomanos = new ConversorNumerosArabigosARomanos();
//        act
        String numeroRomano = conversorNumerosArabigosARomanos.convertir(1);
//        assert
        Assertions.assertEquals(numeroRomano,"I");
    }

    @Test
    void convertirNumeroArabigoARomano2(){
//        arrange
        ConversorNumerosArabigosARomanos conversorNumerosArabigosARomanos = new ConversorNumerosArabigosARomanos();
//        act
        String numeroRomano = conversorNumerosArabigosARomanos.convertir(2);
//        assert
        Assertions.assertEquals(numeroRomano,"II");
    }

    @Test
    void convertirNumeroArabigoARomano3(){
//        arrange
        ConversorNumerosArabigosARomanos conversorNumerosArabigosARomanos = new ConversorNumerosArabigosARomanos();
//        act
        String numeroRomano = conversorNumerosArabigosARomanos.convertir(3);
//        assert
        Assertions.assertEquals(numeroRomano,"III");
    }
}
