
package Controller.Account;

import Controller.Authentication;
import Entities.Account;
import Model.ModelGroup;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccountListController extends Authentication {

    @Override
    public void get(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setAttribute("title", "Account List");
        request.setAttribute("navbar", "account.list");
        request.setAttribute("accounts", ModelGroup.accMdl.list());
        request.getRequestDispatcher("/WEB-INF/Account/List.jsp").forward(request, response);
    }

    @Override
    public void post(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    
    }

}
