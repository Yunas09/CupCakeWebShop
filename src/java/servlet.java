
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {
//Her kalder man på sin Data klasse der indeholder UserName og PassWord. 
    DataAccess DA;

    @Override

    public void init(ServletConfig config) throws ServletException {

        try {
            DA = new DataAccess();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
        HttpSession session = request.getSession(true);
        String do_this = request.getParameter("do_this");
        switch (do_this) {
            
            case "getuser":
       
                String userName = request.getParameter("userName");
                ;

                session.setAttribute("userName", userName);
                
                
                
                
                   
        }
    }
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String do_this = request.getParameter("do_this");

        switch (do_this) {
            case "login":
                String username = request.getParameter("username");
                String pw = request.getParameter("password");
                session.setAttribute("username", username);
                session.setAttribute("pw", pw);

                if (DA.verifyUser(username, pw)) {
                    session.setAttribute("username", username);

                    try {
                        session.setAttribute("balance", DA.getUser(username).getBalance());

                    } catch (SQLException ex) {
                        forward(request, response, "/login.jsp");

                    }
                    forward(request, response, "/cupcakeside.jsp");
                } else {
                    forward(request, response, "/login.jsp");
                }
        }

    }

    private void forward(HttpServletRequest req, HttpServletResponse res, String path) throws IOException, ServletException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(path);
        rd.forward(req, res);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
