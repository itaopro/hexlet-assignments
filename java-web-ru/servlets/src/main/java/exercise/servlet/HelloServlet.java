package io.hexlet.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    // BEGIN
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the 'name' query parameter from the request
        String name = request.getParameter("name");

        // If 'name' parameter is not provided, set it to "Guest"
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }

        // Prepare response
        PrintWriter out = response.getWriter();
        out.println("Hello, " + name + "!");
    }
    // END
}
