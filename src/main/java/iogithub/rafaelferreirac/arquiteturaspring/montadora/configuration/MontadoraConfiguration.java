package iogithub.rafaelferreirac.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import iogithub.rafaelferreirac.arquiteturaspring.montadora.Motor;
import iogithub.rafaelferreirac.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

	@Bean(name = "motorAspirado")
		Motor motorAspirado() {
		var motor= new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-8");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	
}
	@Primary
	@Bean(name = "motorTurbo")
		Motor motorTurbo() {
		var motor= new Motor();
		motor.setCavalos(188);
		motor.setCilindros(4);
		motor.setModelo("XPTO-01");
		motor.setLitragem(1.5);
		motor.setTipo(TipoMotor.TURBO);
		return motor;
}
	@Bean(name = "motorEletrico")
		Motor motorEletrico() {
		var motor= new Motor();
		motor.setCavalos(110);
		motor.setCilindros(3);
		motor.setModelo("TH-10");
		motor.setLitragem(1.4);
		motor.setTipo(TipoMotor.ELETRICO);
		return motor;
	}
}
