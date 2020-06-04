/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author os_conght
 */
public class NormalStudent extends Student {

    public int runForSecretary() {
        // do something 
        return 2;
    }

    public double payTuitionFee() {
        return STANDARD_FEE;
    }
}
