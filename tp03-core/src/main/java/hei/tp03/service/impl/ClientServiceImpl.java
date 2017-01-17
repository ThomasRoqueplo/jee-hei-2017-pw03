package hei.tp03.service.impl;

import hei.tp03.dao.ClientDAO;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Thomas on 17/01/2017.
 */

@Named
@Transactional
public class ClientServiceImpl {
    @Inject
    private ClientDAO clientDAO;
}
