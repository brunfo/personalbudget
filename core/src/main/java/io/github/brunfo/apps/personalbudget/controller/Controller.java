package io.github.brunfo.apps.personalbudget.controller;

import io.github.brunfo.apps.personalbudget.model.Account;
import io.github.brunfo.apps.personalbudget.model.Transaction;

import java.util.List;

public class Controller {

    private final static Controller INSTANCE = new Controller();

    private Accounts accounts;

    private Controller() {
        accounts = new Accounts();
    }

    public static Controller getInstance() {
        return INSTANCE;
    }

    public List<Account> getAccounts() {
        return this.accounts.getAccounts();
    }

    public boolean addAccount(Account tempAccount) {
        return accounts.addAccount(tempAccount);
    }

    public Account getAccount(String accountName) {
        return accounts.getAccount(accountName);
    }

    public Account getAccountById(int accountId) {
        return accounts.getAccountById(accountId);
    }

    public boolean removeAccount(Account account) {
        return accounts.removeAccount(account);
    }

    public boolean addTransaction(Transaction tempTransaction) throws Exception {
        return accounts.addTransaction(tempTransaction);
    }

    public boolean removeTransaction(Transaction transaction) throws Exception {
        return accounts.removeTransaction(transaction);
    }

}
