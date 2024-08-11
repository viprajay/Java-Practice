import javax.servlet.*;
import javax.servlet.HttpServlet.*;
import java.io.*;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve a parameter named "name"
        String name = request.getParameter("name");

        // Use the parameter
        if (name != null && !name.isEmpty()) {
            // Do something with the parameter, e.g., send it back in the response
            PrintWriter out = response.getWriter();
            out.println("Hello, " + name + "!");
        } else {
            // Parameter not provided
            PrintWriter out = response.getWriter();
            out.println("Please provide a name parameter.");
        }
    }
}
