package iogithub.rafaelferreirac.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import iogithub.rafaelferreirac.arquiteturaspring.montadora.Motor;
import iogithub.rafaelferreirac.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

	@Bean
	public Motor motorAspirado() {
		var motor= new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-8");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	
}
	@Bean
	public Motor motorTurbo() {
		var motor= new Motor();
		motor.setCavalos(188);
		motor.setCilindros(4);
		motor.setModelo("XPTO-01");
		motor.setLitragem(1.5);
		motor.setTipo(TipoMotor.TURBO);
		return motor;
}
	@Bean
	public Motor motorEletrico() {
		var motor= new Motor();
		motor.setCavalos(110);
		motor.setCilindros(3);
		motor.setModelo("TH-10");
		motor.setLitragem(1.4);
		motor.setTipo(TipoMotor.ELETRICO);
		return motor;
	}
}
