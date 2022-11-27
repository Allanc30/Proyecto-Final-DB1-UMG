package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.TipoMedicamento;
import umg.bd1.proyectofinal.repositorio.TipoMedicamentoRepository;

@Service
public class TipoMedicamentoServiceImp extends GenericServiceImp<TipoMedicamento, Long> implements TipoMedicamentoService {

    @Autowired
    TipoMedicamentoRepository tipoMedicamentoRepository;

    @Override
    public CrudRepository<TipoMedicamento, Long> getRepository() {
        return tipoMedicamentoRepository;
    }
}
