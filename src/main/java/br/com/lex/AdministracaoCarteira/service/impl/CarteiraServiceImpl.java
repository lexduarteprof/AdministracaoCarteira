package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;
import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import br.com.lex.AdministracaoCarteira.entity.TituloPublicoLFT;
import br.com.lex.AdministracaoCarteira.repository.AtivoRepository;
import br.com.lex.AdministracaoCarteira.repository.CarteiraRepository;
import br.com.lex.AdministracaoCarteira.repository.MovimentoCarteiraRepository;
import br.com.lex.AdministracaoCarteira.service.ICarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteiraServiceImpl implements ICarteiraService {

    @Autowired
    private CarteiraRepository carteiraRepository;
    @Autowired
    private AtivoRepository ativoRepository;

    @Autowired
    private MovimentoCarteiraRepository movimentoCarteiraRepository;


    @Override
    public CarteiraDeAtivos findByidCarteiraDeAtivos(long id) {

            return carteiraRepository.findById(id).orElse(null);

    }
    public CarteiraDeAtivos incluir(CarteiraDeAtivos carteiraDeAtivos) {

        return carteiraRepository.save(carteiraDeAtivos);

    }
    public MovimentoDaCarteira registrarMovimento(MovimentoDaCarteira movimentoDaCarteira) throws Exception {

        if(!ativoRepository.findById(
                movimentoDaCarteira.getAtivoFinanceiro().getIdAtivoFinanceiro()).isPresent()){
            throw new Exception("Ativo Inexistente!");
        }

        if(!carteiraRepository.findById(
                movimentoDaCarteira.getCarteiraDeAtivos().getIdCarteiraDeAtivos()).isPresent()) {
            throw new Exception("Carteira Inexistente!");
        }

        movimentoDaCarteira.setAtivoFinanceiro(ativoRepository.findById(
                movimentoDaCarteira.getAtivoFinanceiro().getIdAtivoFinanceiro()).get());

        movimentoDaCarteira.atualizarPUPelaTaxa();

        return movimentoCarteiraRepository.save(movimentoDaCarteira);

    }







}
