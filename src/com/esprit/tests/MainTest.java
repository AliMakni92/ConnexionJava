/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.tests;

import com.esprit.dao.PersonneDAO;
import com.esprit.entities.Personne;
import java.util.List;

/**
 *
 * @author Karray
 */
public class MainTest {
    public static void main(String[] args) {
        PersonneDAO pdao = new PersonneDAO();
        List<Personne> listePersonnes = pdao.afficherPersonnes();
        System.out.println(listePersonnes);
    }
}
