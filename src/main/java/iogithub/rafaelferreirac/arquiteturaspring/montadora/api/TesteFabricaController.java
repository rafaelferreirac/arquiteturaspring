package iogithub.rafaelferreirac.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iogithub.rafaelferreirac.arquiteturaspring.montadora.CarroStatus;
import iogithub.rafaelferreirac.arquiteturaspring.montadora.Chave;
import iogithub.rafaelferreirac.arquiteturaspring.montadora.HondaHRV;
import iogithub.rafaelferreirac.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
	
	@Autowired
	@Turbo
	private Motor motor;

	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
}
