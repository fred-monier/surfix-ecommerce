package br.pe.recife.surfix.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.pe.recife.surfix.ecommerce.dao.EmpresaAdquirenteDAOIntf;
import br.pe.recife.surfix.ecommerce.entity.EmpresaAdquirente;
import br.pe.recife.surfix.ecommerce.exception.InfraException;

@Transactional
@Service
public class EmpresaAdquirenteService {
	
	@Autowired
	//@Qualifier("empresaAdquirenteDAO")
	private EmpresaAdquirenteDAOIntf empresaAdquirenteDao;		
	
	public List<EmpresaAdquirente> listar() throws InfraException {

		return empresaAdquirenteDao.listar();
	}
	
	public EmpresaAdquirente consultarPorId(Integer id) throws InfraException {

		return empresaAdquirenteDao.consultarPorId(id);
	}
	
	public void salvar(EmpresaAdquirente empresaAdquirente) throws InfraException {

		empresaAdquirenteDao.salvar(empresaAdquirente);		
	}
	
	public void excluir(Integer id) throws InfraException {

		empresaAdquirenteDao.excluir(id);		
	}
		
}
