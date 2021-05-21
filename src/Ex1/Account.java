/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Date;

/**
 *
 * @author notda
 */
public class Account {
    int Balance;
    private Date dateCreated;

    public Account() {
    }

    
    public Account(int Balance) {
        this.Balance = Balance;
    }

    public int getBalance() {
        return Balance;
    }
    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "Account{" + "Balance=" + Balance + ", dateCreated=" + dateCreated + '}';
    }
  
}
