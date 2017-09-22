/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.ArrayList;
import java.util.Scanner;
import server.controllers.ControllerCardapio;
import server.controllers.ControllerLoja;
import server.model.Cardapio;
import server.model.ContaCliente;
import server.model.Loja;

/**
 *
 * @author Felix
 */
public class TelaVisualizarLojasCliente {

    private int idPedido;
    private Scanner entrada;
    private int escolha;
    private String idLoja;
    private boolean op;

    public void exibirMenu() {
        listarLojas();
        System.out.println("1) Selecionar Loja e Ver Cardapio");
        System.out.println("2) Voltar");
        System.out.print("Digite uma opção:");
        lerEntrada();
        switchMenu();
    }

    private void listarLojas() {
        ControllerLoja ctrLoja = new ControllerLoja();
        for (String linha : ctrLoja.verLojas()) {
            System.out.println(linha);
        }
    }

    private void lerEntrada() {
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        entrada.nextLine();
        System.gc();
    }

    public void switchMenu() {
        switch (this.escolha) {
            case 1:
                System.out.println("Digite o ID da loja:");
                String id = entrada.nextLine();
                ControllerCardapio controlCardapio = new ControllerCardapio();
                Cardapio cardapio = controlCardapio.getCardapio(id);
                if (cardapio != null) {
                    TelaVerCardapioCliente telaVCC = new TelaVerCardapioCliente(cardapio);
                    telaVCC.listarCardapio();
                } else {
                    System.out.println("Cardapio de Loja não encontrado!");
                }
                break;
            case 2:

                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

