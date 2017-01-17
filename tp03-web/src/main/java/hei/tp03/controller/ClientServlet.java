package hei.tp03.controller;

import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Thomas on 17/01/2017.
 */
@WebServlet(urlPatterns = "/test")
public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Client> list = clientService.findAll();
        PrintWriter out = resp.getWriter();
        list.stream().map(Client::getNom).forEach(out::append);
    }

    @Override
    public void destroy() {
        super.destroy();
        context.close();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        context = new AnnotationConfigApplicationContext("hei.tp03.config");
        clientService = (ClientService) context.getBean(ClientService.class);
    }
}
