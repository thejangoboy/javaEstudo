package br.com.jangoboy;

import br.com.jangoboy.dao.ClienteMapDAO;
import br.com.jangoboy.dao.IClienteDAO;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null);
    }
}
